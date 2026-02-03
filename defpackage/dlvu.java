package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvu implements dlvp {
    public static final dlvu a;
    public static final dlvu b;
    public static final dlvu c;
    public static final dlvu d;
    private static final /* synthetic */ dlvu[] f;
    public final ekhx e;
    private final /* synthetic */ dlvt g;

    static {
        ekhx ekhxVarU = ekhx.u(dlvm.b, dlvm.c, dlvm.d, dlvm.e, dlvm.g);
        ekhxVarU.getClass();
        dlvu dlvuVar = new dlvu("AUDIO", 0, ekhxVarU);
        a = dlvuVar;
        ekhx ekhxVarU2 = ekhx.u(dlvm.b, dlvm.c, dlvm.d, dlvm.e, dlvm.f);
        ekhxVarU2.getClass();
        dlvu dlvuVar2 = new dlvu("IMAGE", 1, ekhxVarU2);
        b = dlvuVar2;
        ekhx ekhxVarV = ekhx.v(dlvm.b, dlvm.c, dlvm.d, dlvm.e, dlvm.f, dlvm.g, new dlvm[0]);
        ekhxVarV.getClass();
        dlvu dlvuVar3 = new dlvu(VCardConstants.PARAM_TYPE_VIDEO, 2, ekhxVarV);
        c = dlvuVar3;
        ekhx ekhxVarT = ekhx.t(dlvm.b, dlvm.c, dlvm.d, dlvm.e);
        ekhxVarT.getClass();
        dlvu dlvuVar4 = new dlvu("ARBITRARY_FILE", 3, ekhxVarT);
        d = dlvuVar4;
        dlvu[] dlvuVarArr = {dlvuVar, dlvuVar2, dlvuVar3, dlvuVar4};
        f = dlvuVarArr;
        fczb.a(dlvuVarArr);
    }

    public /* synthetic */ dlvu(String str, int i, ekhx ekhxVar) {
        this.g = new dlvt(dlvq.a, ekhxVar);
        this.e = ekhxVar;
    }

    public static dlvu[] values() {
        return (dlvu[]) f.clone();
    }

    @Override // defpackage.dlvp
    public final String[] a(dlvo dlvoVar) {
        dlvoVar.getClass();
        return this.g.a(dlvoVar);
    }
}
