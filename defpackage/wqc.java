package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wqc extends fcyz implements fdat {
    int a;
    final /* synthetic */ Instant b;
    final /* synthetic */ wqd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqc(Instant instant, wqd wqdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = instant;
        this.c = wqdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wqc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = wqd.a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/ComposeRowStateParser$setLastAcceptedDraftTimestamp$2", "invokeSuspend", 157, "ComposeRowStateParser.kt");
            final Instant instant = this.b;
            ekrdVar.s("ComposeRowStateParser#setLastAcceptedDraftTimestamp: setting last accepted draft timestamp: %d", instant.toEpochMilli());
            Object objB = this.c.d.b();
            objB.getClass();
            cmfo cmfoVar = (cmfo) fdct.b((Optional) objB);
            if (cmfoVar == null) {
                return null;
            }
            fdap fdapVar = new fdap() { // from class: wqb
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    wqw wqwVar = (wqw) ((wqx) obj2).toBuilder();
                    evvp evvpVarB = evxd.b(instant);
                    wqwVar.copyOnWrite();
                    wqx wqxVar = (wqx) wqwVar.instance;
                    wqxVar.c = evvpVarB;
                    wqxVar.b |= 1;
                    evsn evsnVarBuild = wqwVar.build();
                    evsnVarBuild.getClass();
                    return (wqx) evsnVarBuild;
                }
            };
            this.a = 1;
            obj = cmfoVar.d(fdapVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return (wqx) obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wqc(this.b, this.c, fcxyVar);
    }
}
