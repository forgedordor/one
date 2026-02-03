package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugPrefsItemView;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbp extends BaseAdapter implements cxbr {
    private final LayoutInflater a;
    private final SharedPreferences b;
    private final List c;

    public cxbp(LayoutInflater layoutInflater) {
        this.a = layoutInflater;
        SharedPreferences sharedPreferences = layoutInflater.getContext().getSharedPreferences("bugle", 0);
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.c = fcva.ak(sharedPreferences.getAll().keySet());
    }

    @Override // defpackage.cxbr
    public final void a(String str, Object obj) {
        str.getClass();
        obj.getClass();
        SharedPreferences.Editor editorEdit = this.b.edit();
        if (obj instanceof String) {
            editorEdit.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            editorEdit.putInt(str, ((Number) obj).intValue());
        } else {
            if (!(obj instanceof Long)) {
                Objects.toString(obj);
                throw new IllegalArgumentException("Unexpected debug value ".concat(obj.toString()));
            }
            editorEdit.putLong(str, ((Number) obj).longValue());
        }
        editorEdit.apply();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DebugPrefsItemView debugPrefsItemView;
        if (view instanceof DebugPrefsItemView) {
            debugPrefsItemView = (DebugPrefsItemView) view;
        } else {
            View viewInflate = this.a.inflate(R.layout.debug_prefs_item_view, viewGroup, false);
            viewInflate.getClass();
            debugPrefsItemView = (DebugPrefsItemView) viewInflate;
        }
        String str = (String) this.c.get(i);
        SharedPreferences sharedPreferences = this.b;
        cxbs cxbsVarH = debugPrefsItemView.H();
        Object obj = sharedPreferences.getAll().get(str);
        str.getClass();
        cxbsVarH.e = this;
        cxbsVarH.c = str;
        cxbsVarH.d = obj;
        cxbsVarH.a.setText(str);
        cxbsVarH.b.setText(String.valueOf(obj));
        return debugPrefsItemView;
    }
}
