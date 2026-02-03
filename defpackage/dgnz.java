package defpackage;

import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgnz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgnz(fcxy fcxyVar, dgom dgomVar, Object obj, Object obj2) {
        super(2, fcxyVar);
        this.b = dgomVar;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgnz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            feavVar = (feav) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            feav feavVar2 = this.b.m;
            this.e = feavVar2;
            this.a = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            feavVar = feavVar2;
        }
        try {
            Deque deque = this.b.h;
            Object obj2 = this.c;
            deque.addLast(new fcti(obj2, this.d));
            ((ekrd) dgom.c.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$deferMessage$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 398, "StateMachineV2.kt")).t("Added deferred %s", obj2);
            feavVar.d();
            return fctx.a;
        } catch (Throwable th) {
            feavVar.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dgnz dgnzVar = new dgnz(fcxyVar, this.b, this.c, this.d);
        dgnzVar.e = obj;
        return dgnzVar;
    }
}
