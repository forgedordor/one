package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cguv extends fcyz implements fdat {
    int a;
    final /* synthetic */ aujb b;
    final /* synthetic */ aubq c;
    final /* synthetic */ evuh d;
    final /* synthetic */ aubq e;
    final /* synthetic */ aufx f;
    final /* synthetic */ boolean g;
    final /* synthetic */ cayy h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cguv(fcxy fcxyVar, aujb aujbVar, aubq aubqVar, evuh evuhVar, aubq aubqVar2, aufx aufxVar, boolean z, cayy cayyVar) {
        super(2, fcxyVar);
        this.b = aujbVar;
        this.c = aubqVar;
        this.d = evuhVar;
        this.e = aubqVar2;
        this.f = aufxVar;
        this.g = z;
        this.h = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cguv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        chfd chfdVar;
        aubq aubqVar;
        aufx aufxVar;
        boolean z;
        cguv cguvVar;
        aujb aujbVar;
        Exception exc;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            aujbVar = (aujb) this.i;
            try {
                fctl.b(obj);
                cguvVar = this;
            } catch (Exception e) {
                exc = e;
                try {
                    ((ekrd) ((ekrd) aujb.a.j()).g(exc).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 232, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
                    return cbcw.k();
                } catch (Exception e2) {
                    e = e2;
                    ((ekrd) ((ekrd) aujb.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 165, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send for pre-fetched conversation properties failed.");
                    return cbcw.k();
                }
            }
        } else {
            fctl.b(obj);
            try {
                ((ekrd) aujb.a.e().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 146, "RcsProtoMessageSenderHandler.kt")).q("Preparing to send RCS proto message based on pre-fetched conversation properties.");
                aujb aujbVar2 = this.b;
                asrg asrgVar = new asrg(this.c);
                efnn efnnVar = aujbVar2.e;
                evuh evuhVar = this.d;
                Class<?> cls = evuhVar.getClass();
                int i = fdcj.a;
                try {
                    chfdVar = new chfd(evuhVar, new fdbi(cidf.class), efnnVar.b(new fdbi(cls)).b);
                    aubqVar = this.e;
                    aufxVar = this.f;
                    z = this.g;
                    this.i = aujbVar2;
                    this.a = 1;
                    cguvVar = this;
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    ((ekrd) ((ekrd) aujb.a.j()).g(exc).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 232, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
                    return cbcw.k();
                }
                try {
                    obj = aujbVar2.g(chfdVar, asrgVar, aubqVar, aufxVar, z, cguvVar);
                    if (obj == fcylVar) {
                        return fcylVar;
                    }
                    aujbVar = aujbVar2;
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    ((ekrd) ((ekrd) aujb.a.j()).g(exc).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 232, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
                    return cbcw.k();
                }
            } catch (Exception e5) {
                e = e5;
                ((ekrd) ((ekrd) aujb.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 165, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send for pre-fetched conversation properties failed.");
                return cbcw.k();
            }
        }
        return aujbVar.b((chvf) obj, cguvVar.h);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cguv cguvVar = new cguv(fcxyVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        cguvVar.i = obj;
        return cguvVar;
    }
}
