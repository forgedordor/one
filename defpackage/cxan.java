package defpackage;

import android.widget.SearchView;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxan implements SearchView.OnQueryTextListener {
    final /* synthetic */ DebugGServiceKeysFragment a;

    public cxan(DebugGServiceKeysFragment debugGServiceKeysFragment) {
        this.a = debugGServiceKeysFragment;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        DebugGServiceKeysFragment debugGServiceKeysFragment = this.a;
        debugGServiceKeysFragment.ag.setVisibility(str.length() > 0 ? 8 : 0);
        cxav cxavVar = debugGServiceKeysFragment.aj;
        str.getClass();
        List list = cxavVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (fdgn.G((String) obj, str, false)) {
                arrayList.add(obj);
            }
        }
        cxau cxauVar = debugGServiceKeysFragment.d;
        cxauVar.a = ekgb.n(arrayList);
        cxauVar.notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        return false;
    }
}
