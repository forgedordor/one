package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dsuo {
    public abstract dsup a();

    public abstract void b(String str);

    public abstract void c(evuh evuhVar);

    public abstract void d(eyek eyekVar);

    public final dsup e() {
        dsup dsupVarA = a();
        dbyw dbywVar = ((dsun) dsupVarA).h;
        if (dbywVar != null) {
            eyen eyenVarB = dbywVar.b();
            boolean z = true;
            if (eyenVarB != eyen.EVENT_OVERRIDE && eyenVarB != eyen.EVENT_DEFERRING) {
                z = false;
            }
            ejyb.a(z);
        }
        return dsupVarA;
    }
}
