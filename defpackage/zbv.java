package defpackage;

import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zbv extends fcyz implements fdat {
    int a;
    final /* synthetic */ zbw b;
    final /* synthetic */ String c;
    final /* synthetic */ fduf d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbv(zbw zbwVar, String str, fduf fdufVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zbwVar;
        this.c = str;
        this.d = fdufVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zbv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdjx fdjxVar = (fdjx) this.e;
                ejly ejlyVar = (ejly) this.b.b.b();
                String str = this.c;
                ejgz ejgzVar = (ejgz) ejha.a.createBuilder();
                ejgzVar.getClass();
                ejhb ejhbVar = (ejhb) ejhc.a.createBuilder();
                ejhbVar.getClass();
                ejhd.c(str, ejhbVar);
                ejhd.b("screen_effects", ejhbVar);
                ejgy.b(ejhd.a(ejhbVar), ejgzVar);
                fcyh fcyhVarB = auus.b(ejlyVar.c(ejgy.a(ejgzVar)), fdjxVar);
                this.a = 1;
                obj = ((fdme) fcyhVarB).hJ(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            evrr evrrVarA = evrr.a();
            evxl evxlVar = ((evxw) evsn.parseFrom(evxw.a, (InputStream) obj, evrrVarA)).c;
            if (evxlVar == null) {
                evxlVar = evxl.a;
            }
            evxlVar.getClass();
            this.d.f(evxlVar);
        } catch (Exception e) {
            ekrd ekrdVarA = zbw.a.a(Level.WARNING);
            ekrdVarA.X(eksq.a, "BugleReactions");
            ((ekrd) ekrdVarA.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/effects/ReactionEffectAnimationMap$loadEffectAsset$1", "invokeSuspend", 61, "ReactionEffectAnimationMap.kt")).D("Could not parse the reaction effects %s from mdd: %s", this.c, e.toString());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        zbv zbvVar = new zbv(this.b, this.c, this.d, fcxyVar);
        zbvVar.e = obj;
        return zbvVar;
    }
}
