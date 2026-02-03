package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListFragment;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljb extends lja {
    protected int[] a;
    protected final int[] e;
    final String[] f;
    public cwng g;
    private final int h;

    public ljb(Context context, String[] strArr, int[] iArr) {
        super(context);
        this.h = -1;
        this.e = iArr;
        this.f = strArr;
        d(null, strArr);
    }

    private final void d(Cursor cursor, String[] strArr) {
        if (cursor == null || strArr == null) {
            this.a = null;
            return;
        }
        if (this.a == null) {
            this.a = new int[2];
        }
        for (int i = 0; i < 2; i++) {
            this.a[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
    }

    @Override // defpackage.lix, defpackage.liy
    public final CharSequence c(Cursor cursor) {
        return (this.h < 0 || cursor == null) ? cursor == null ? "" : cursor.toString() : cursor.getString(0);
    }

    @Override // defpackage.lix
    public final void f(View view, Cursor cursor) {
        int[] iArr;
        int i;
        String strD;
        int[] iArr2 = this.e;
        if (iArr2 == null || (iArr = this.a) == null) {
            throw new IllegalStateException("The `to` and `from` arrays must be non-null and of equal length for binding to occur");
        }
        cwng cwngVar = this.g;
        int i2 = 0;
        while (i2 < 2) {
            View viewFindViewById = view.findViewById(iArr2[i2]);
            if (viewFindViewById != null) {
                if (cwngVar != null) {
                    int i3 = iArr[i2];
                    bqtk bqtkVar = (bqtk) cursor;
                    bqti bqtiVar = bqub.c;
                    int columnIndex = cursor.getColumnIndex(bqtiVar.c.toString());
                    MessageStatusListFragment messageStatusListFragment = cwngVar.a;
                    if (i3 == columnIndex) {
                        TextView textView = (TextView) viewFindViewById;
                        long jE = bqtkVar.e() - messageStatusListFragment.am;
                        long hours = TimeUnit.MILLISECONDS.toHours(jE);
                        i = i2;
                        long minutes = TimeUnit.MILLISECONDS.toMinutes(jE) % TimeUnit.HOURS.toMinutes(1L);
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(jE) % TimeUnit.MINUTES.toSeconds(1L);
                        long millis = jE % TimeUnit.SECONDS.toMillis(1L);
                        textView.setText(hours > 0 ? String.format(Locale.US, "%1d:%02d:%02d:%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis)) : String.format(Locale.US, "%01d:%02d:%03d", Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(millis)));
                    } else {
                        i = i2;
                        if (i3 == cursor.getColumnIndex(bqtiVar.d.toString())) {
                            int i4 = cursor.getInt(cursor.getColumnIndex("table_source"));
                            int iC = bqtkVar.c();
                            if (i4 != 1) {
                                strD = null;
                                if (i4 == 2) {
                                    try {
                                        aiwp[] aiwpVarArrValues = aiwp.values();
                                        if (iC >= aiwpVarArrValues.length) {
                                            throw new IllegalArgumentException();
                                        }
                                        strD = messageStatusListFragment.ak.c(aiwpVarArrValues[iC], bqtkVar.g());
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }
                            } else {
                                strD = iC >= 0 ? messageStatusListFragment.aj.d(iC, bqtkVar.g()) : messageStatusListFragment.aj.c(bqtkVar.f());
                            }
                            String strG = bqtkVar.g();
                            if (true == TextUtils.isEmpty(strD)) {
                                strD = strG;
                            }
                            ((TextView) viewFindViewById).setText(strD);
                        }
                    }
                } else {
                    i = i2;
                }
                String string = cursor.getString(iArr[i]);
                if (string == null) {
                    string = "";
                }
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(string);
                } else {
                    if (!(viewFindViewById instanceof ImageView)) {
                        throw new IllegalStateException(String.valueOf(viewFindViewById.getClass().getName()).concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                    }
                    ImageView imageView = (ImageView) viewFindViewById;
                    try {
                        imageView.setImageResource(Integer.parseInt(string));
                    } catch (NumberFormatException unused2) {
                        imageView.setImageURI(Uri.parse(string));
                    }
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
    }

    @Override // defpackage.lix
    public final Cursor h(Cursor cursor) {
        d(cursor, this.f);
        return super.h(cursor);
    }
}
