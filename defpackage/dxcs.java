package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxcs extends mr {
    private static final String a = "dxcs";

    @Override // defpackage.mr
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((dxcp) obj).equals((dxcp) obj2);
    }

    @Override // defpackage.mr
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        dxcp dxcpVar = (dxcp) obj;
        dxcp dxcpVar2 = (dxcp) obj2;
        if (dxcpVar.e() != dxcpVar2.e()) {
            return false;
        }
        int iOrdinal = dxcpVar.e().ordinal();
        if (iOrdinal == 0) {
            return ((dwqw) dxcpVar.b().c().c()).r().equals(((dwqw) dxcpVar2.b().c().c()).r());
        }
        if (iOrdinal == 1) {
            return dxcpVar.a().d().equals(dxcpVar2.a().d());
        }
        if (iOrdinal == 2) {
            return ((dwqw) dxcpVar.c().c().c()).r().equals(((dwqw) dxcpVar2.c().c().c()).r());
        }
        if (iOrdinal == 3) {
            return ((dwqw) dxcpVar.d().c().c()).r().equals(((dwqw) dxcpVar2.d().c().c()).r());
        }
        if (iOrdinal == 4) {
            return false;
        }
        dvhv.c(a, "Unrecognized messageList cell type");
        return true;
    }
}
