package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzeo extends fcyz implements fdat {
    final /* synthetic */ bzep a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ bzbz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzeo(bzep bzepVar, String str, String str2, bzbz bzbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bzepVar;
        this.b = str;
        this.c = str2;
        this.d = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzeo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bzep bzepVar = this.a;
        String str = this.b;
        String str2 = this.c;
        bzbz bzbzVar = this.d;
        eieu eieuVarH = eiiy.h("CmsParticipantsBackupDelegate.uploadProfilePhoto");
        try {
            try {
                Optional optionalA = bzepVar.c.a(str);
                optionalA.getClass();
                if (optionalA.isPresent()) {
                    bzepVar.d.h(((cpua) optionalA.get()).b());
                } else {
                    eksl ekslVar = (eksl) bzep.a.j();
                    ekslVar.X(bzmz.c, str);
                    ekrz ekrzVar = bzmz.d;
                    bzch bzchVar = bzbzVar.b;
                    ekslVar.X(ekrzVar, bzchVar.a);
                    ekslVar.X(bzmz.p, Integer.valueOf(bzchVar.b));
                    ekslVar.X(cqnc.p, str2);
                    ekslVar.q("Failure because CmsParticipant data is not found.");
                }
            } catch (Exception e) {
                eksl ekslVar2 = (eksl) ((eksl) bzep.a.j()).g(e);
                ekslVar2.X(bzmz.c, str);
                ekrz ekrzVar2 = bzmz.d;
                bzch bzchVar2 = bzbzVar.b;
                ekslVar2.X(ekrzVar2, bzchVar2.a);
                ekslVar2.X(bzmz.p, Integer.valueOf(bzchVar2.b));
                ekslVar2.X(cqnc.p, str2);
                ekslVar2.q("Failure while uploading CmsParticipant profile photo.");
            }
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzeo(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
