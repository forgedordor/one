package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yp extends lja implements View.OnClickListener {
    public int a;
    private final SearchView e;
    private final SearchableInfo f;
    private final Context g;
    private final WeakHashMap h;
    private final int i;
    private ColorStateList j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    public yp(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.a = 1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.e = searchView;
        this.f = searchableInfo;
        this.i = searchView.getSuggestionCommitIconResId();
        this.g = context;
        this.h = weakHashMap;
    }

    public static String d(Cursor cursor, String str) {
        return n(cursor, cursor.getColumnIndex(str));
    }

    private final Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.h.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private final Drawable l(Uri uri) throws PackageManager.NameNotFoundException, IOException, NumberFormatException {
        int identifier;
        try {
            if (!"android.resource".equals(uri.getScheme())) {
                InputStream inputStreamOpenInputStream = this.g.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new FileNotFoundException(a.l(uri, "Failed to open "));
                }
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                    try {
                        return drawableCreateFromStream;
                    } catch (IOException e) {
                        return drawableCreateFromStream;
                    }
                } finally {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e2) {
                        Log.e("SuggestionsAdapter", a.l(uri, "Error closing icon stream for "), e2);
                    }
                }
            }
            try {
                String authority = uri.getAuthority();
                if (TextUtils.isEmpty(authority)) {
                    Objects.toString(uri);
                    throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
                }
                try {
                    Resources resourcesForApplication = this.g.getPackageManager().getResourcesForApplication(authority);
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null) {
                        Objects.toString(uri);
                        throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
                    }
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            Objects.toString(uri);
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    } else {
                        if (size != 2) {
                            Objects.toString(uri);
                            throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                        }
                        identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    }
                    if (identifier != 0) {
                        return resourcesForApplication.getDrawable(identifier);
                    }
                    Objects.toString(uri);
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
                } catch (PackageManager.NameNotFoundException unused2) {
                    Objects.toString(uri);
                    throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
                }
            } catch (Resources.NotFoundException unused3) {
                throw new FileNotFoundException(a.l(uri, "Resource does not exist: "));
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private final Drawable m(String str) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder("android.resource://");
            Context context = this.g;
            sb.append(context.getPackageName());
            sb.append("/");
            sb.append(i);
            String string = sb.toString();
            Drawable drawableK = k(string);
            if (drawableK != null) {
                return drawableK;
            }
            Drawable drawable = context.getDrawable(i);
            o(string, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableK2 = k(str);
            if (drawableK2 != null) {
                return drawableK2;
            }
            Drawable drawableL = l(Uri.parse(str));
            o(str, drawableL);
            return drawableL;
        }
    }

    private static String n(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private final void o(String str, Drawable drawable) {
        if (drawable != null) {
            this.h.put(str, drawable.getConstantState());
        }
    }

    private static final void p(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private static final void q(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private static final void r(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // defpackage.lix, defpackage.liy
    public final Cursor a(CharSequence charSequence) {
        String suggestAuthority;
        String[] strArr;
        Cursor cursorQuery;
        String string = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.e;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = this.f;
                if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                    cursorQuery = null;
                } else {
                    Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        builderFragment.appendEncodedPath(suggestPath);
                    }
                    builderFragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{string};
                    } else {
                        builderFragment.appendPath(string);
                        strArr = null;
                    }
                    builderFragment.appendQueryParameter("limit", "50");
                    cursorQuery = this.g.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr, null);
                }
                if (cursorQuery != null) {
                    cursorQuery.getCount();
                    return cursorQuery;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // defpackage.lja, defpackage.lix
    public final View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewB = super.b(context, cursor, viewGroup);
        viewB.setTag(new yo(viewB));
        ((ImageView) viewB.findViewById(R.id.edit_query)).setImageResource(this.i);
        return viewB;
    }

    @Override // defpackage.lix, defpackage.liy
    public final CharSequence c(Cursor cursor) {
        String strD;
        String strD2;
        if (cursor == null) {
            return null;
        }
        String strD3 = d(cursor, "suggest_intent_query");
        if (strD3 != null) {
            return strD3;
        }
        SearchableInfo searchableInfo = this.f;
        if (searchableInfo.shouldRewriteQueryFromData() && (strD2 = d(cursor, "suggest_intent_data")) != null) {
            return strD2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strD = d(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strD;
    }

    @Override // defpackage.lix, defpackage.liy
    public final void e(Cursor cursor) {
        try {
            super.e(cursor);
            if (cursor != null) {
                this.k = cursor.getColumnIndex("suggest_text_1");
                this.l = cursor.getColumnIndex("suggest_text_2");
                this.m = cursor.getColumnIndex("suggest_text_2_url");
                this.n = cursor.getColumnIndex("suggest_icon_1");
                this.o = cursor.getColumnIndex("suggest_icon_2");
                this.p = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    @Override // defpackage.lix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.view.View r20, android.database.Cursor r21) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp.f(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.lix, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewJ = j(viewGroup);
            if (viewJ != null) {
                ((yo) viewJ.getTag()).a.setText(e.toString());
            }
            return viewJ;
        }
    }

    @Override // defpackage.lix, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewB = b(this.g, this.d, viewGroup);
            if (viewB != null) {
                ((yo) viewB.getTag()).a.setText(e.toString());
            }
            return viewB;
        }
    }

    @Override // defpackage.lix, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        r(this.d);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        r(this.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.e.onQueryRefine((CharSequence) tag);
        }
    }
}
