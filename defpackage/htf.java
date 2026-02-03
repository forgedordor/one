package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htf extends hty {
    public static final htf a = new htf();

    private htf() {
        super(0, 3, 1);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        hub hubVar;
        hra hraVar = (hra) hudVar.c(1);
        hlv hlvVar = (hlv) hudVar.c(0);
        hso hsoVar = (hso) hudVar.c(2);
        hre hreVarD = hraVar.d();
        if (htzVar != null) {
            try {
                hubVar = new hub(htzVar, hreVar);
            } catch (Throwable th) {
                hreVarD.A(false);
                throw th;
            }
        } else {
            hubVar = null;
        }
        if (!hsoVar.b.d()) {
            hmz.j("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        hsoVar.a.b(hlwVar, hreVarD, hqsVar, hubVar);
        hreVarD.A(true);
        hreVar.z();
        hreVar.Z(hraVar, hraVar.a(hlvVar));
        hreVar.B();
    }
}
