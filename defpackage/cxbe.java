package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigItemView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbe extends BaseAdapter implements cxbh {
    public final cmuh a;
    public final cmtg b;
    public final Map c;
    private final LayoutInflater d;
    private final List e;
    private final int f;
    private final cmtp g;

    public cxbe(cmum cmumVar, cmtg cmtgVar, cmtp cmtpVar, Context context, int i, boolean z) {
        this.d = LayoutInflater.from(context);
        this.a = cmumVar.a(i);
        this.f = i;
        this.g = cmtpVar;
        this.b = cmtgVar;
        TreeMap treeMapD = cmtpVar.d(i, z);
        this.c = treeMapD;
        ArrayList arrayList = new ArrayList(treeMapD.keySet());
        this.e = arrayList;
        arrayList.add(0, "How do I use this debug tool?");
    }

    final void a() {
        this.b.b.clear();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        DebugMmsConfigItemView debugMmsConfigItemView = view instanceof DebugMmsConfigItemView ? (DebugMmsConfigItemView) view : (DebugMmsConfigItemView) this.d.inflate(R.layout.debug_mmsconfig_item_view, viewGroup, false);
        String str = (String) this.e.get(i);
        if (str.equals("How do I use this debug tool?")) {
            debugMmsConfigItemView.d = str;
            debugMmsConfigItemView.a.setText(str);
            return debugMmsConfigItemView;
        }
        cmtr cmtrVar = (cmtr) this.c.get(str);
        if (cmtrVar == null) {
            return debugMmsConfigItemView;
        }
        cmtp cmtpVar = this.g;
        int i2 = this.f;
        Object objB = cmtrVar.b();
        cmtq cmtqVarA = cmtrVar.a();
        TreeMap treeMap = new TreeMap();
        treeMap.put(cmtq.DEFAULTS, String.valueOf(cmtp.a().get(str)));
        treeMap.put(cmtq.BUGLE_MMS_CONFIG, String.valueOf(((cmuy) cmtpVar.b.b()).a(i2).get(str)));
        treeMap.put(cmtq.OEM_SPECIFIC_OVERRIDE, String.valueOf(((cmux) cmtpVar.a.b()).a(i2).getString(str)));
        treeMap.put(cmtq.PLATFORM, String.valueOf(((cmve) cmtpVar.c.b()).a(i2).get(str)));
        treeMap.put(cmtq.SERVER_SIDE_OVERRIDE_MOBILE_CONFIG, String.valueOf(((cmuo) cmtpVar.d.b()).a(i2).get(str)));
        treeMap.put(cmtq.USER_SETTING, String.valueOf(cmtpVar.b(i2).get(str)));
        debugMmsConfigItemView.e = this;
        debugMmsConfigItemView.d = str;
        debugMmsConfigItemView.i = cmuc.b(objB);
        Context context = debugMmsConfigItemView.getContext();
        debugMmsConfigItemView.g = "(" + cmtqVarA.j + ") " + str;
        debugMmsConfigItemView.a.setText(debugMmsConfigItemView.g);
        StringBuilder sb = new StringBuilder("\n");
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append("(");
            sb.append(((cmtq) entry.getKey()).j);
            sb.append(") ");
            sb.append(((cmtq) entry.getKey()).toString().toLowerCase(craf.c(context)));
            sb.append(" :  ");
            sb.append((String) entry.getValue());
            sb.append("\n");
        }
        debugMmsConfigItemView.h = sb.toString();
        int i3 = debugMmsConfigItemView.i;
        int i4 = i3 - 1;
        int i5 = cmtg.c;
        if (i3 == 0) {
            throw null;
        }
        String string = i4 != 4 ? i4 != 5 ? objB.toString() : Arrays.toString((String[]) objB) : Arrays.toString((int[]) objB);
        int i6 = debugMmsConfigItemView.i;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                debugMmsConfigItemView.c.setVisibility(0);
                debugMmsConfigItemView.b.setVisibility(8);
                debugMmsConfigItemView.c.setChecked(Boolean.parseBoolean(string));
                return debugMmsConfigItemView;
            }
            if (i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5) {
                debugMmsConfigItemView.b.setVisibility(8);
                debugMmsConfigItemView.c.setVisibility(8);
                cqca.f("Bugle", "Unexpected keytype: " + cmuc.a(debugMmsConfigItemView.i) + " key: " + str);
                return debugMmsConfigItemView;
            }
        }
        debugMmsConfigItemView.b.setVisibility(0);
        debugMmsConfigItemView.c.setVisibility(8);
        debugMmsConfigItemView.b.setText(string);
        debugMmsConfigItemView.b.setMaxWidth(500);
        return debugMmsConfigItemView;
    }
}
