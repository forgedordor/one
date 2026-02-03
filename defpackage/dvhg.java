package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhg extends mj implements dwxp {
    public final dwxq d;
    public final Map e;
    public final SparseArray f;
    private final dwxn g;

    public dvhg(dwxq dwxqVar, Context context) {
        super(new dvhe());
        this.d = dwxqVar;
        this.e = new HashMap();
        this.f = new SparseArray();
        this.g = new dvhf(new View(context));
        ((dvhh) dwxqVar).e.al(this);
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        String strA = ((dwxo) b(i)).a();
        Map map = this.e;
        if (map.get(strA) != null) {
            return ((Integer) map.get(strA)).intValue();
        }
        throw new IllegalStateException("getItemViewType - AttachmentPreviewsInterface not provided to handle attachment type: ".concat(String.valueOf(strA)));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        dwxr dwxrVar = (dwxr) this.f.get(i);
        return dwxrVar == null ? this.g : dwxrVar.a();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        ((dwxn) wvVar).C();
    }
}
