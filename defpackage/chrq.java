package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chrq extends fcyz implements fdat {
    int a;
    final /* synthetic */ aujb b;
    final /* synthetic */ aubq c;
    final /* synthetic */ evuh d;
    final /* synthetic */ aubq e;
    final /* synthetic */ aufx f;
    final /* synthetic */ boolean g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chrq(fcxy fcxyVar, aujb aujbVar, aubq aubqVar, evuh evuhVar, aubq aubqVar2, aufx aufxVar, boolean z) {
        super(2, fcxyVar);
        this.b = aujbVar;
        this.c = aubqVar;
        this.d = evuhVar;
        this.e = aubqVar2;
        this.f = aufxVar;
        this.g = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chrq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aujb aujbVar;
        fcyl fcylVar = fcyl.a;
        try {
            try {
                if (this.a != 0) {
                    aujbVar = (aujb) this.h;
                    fctl.b(obj);
                } else {
                    fctl.b(obj);
                    ((ekrd) aujb.a.e().h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 146, "RcsProtoMessageSenderHandler.kt")).q("Preparing to send RCS proto message based on pre-fetched conversation properties.");
                    aujb aujbVar2 = this.b;
                    asrg asrgVar = new asrg(this.c);
                    efnn efnnVar = aujbVar2.e;
                    evuh evuhVar = this.d;
                    Class<?> cls = evuhVar.getClass();
                    int i = fdcj.a;
                    chfd chfdVar = new chfd(evuhVar, new fdbi(chrh.class), efnnVar.b(new fdbi(cls)).b);
                    aubq aubqVar = this.e;
                    aufx aufxVar = this.f;
                    boolean z = this.g;
                    this.h = aujbVar2;
                    this.a = 1;
                    obj = aujbVar2.g(chfdVar, asrgVar, aubqVar, aufxVar, z, this);
                    if (obj == fcylVar) {
                        return fcylVar;
                    }
                    aujbVar = aujbVar2;
                }
                return aujbVar.b((chvf) obj, null);
            } catch (Exception e) {
                ((ekrd) ((ekrd) aujb.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 232, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
                return cbcw.k();
            }
        } catch (Exception e2) {
            ((ekrd) ((ekrd) aujb.a.j()).g(e2).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler$handleWorkWithPrefetchedProperties$$inlined$withLegacyPropagatingContext$1", "invokeSuspend$$forInline", 165, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send for pre-fetched conversation properties failed.");
            return cbcw.k();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chrq chrqVar = new chrq(fcxyVar, this.b, this.c, this.d, this.e, this.f, this.g);
        chrqVar.h = obj;
        return chrqVar;
    }
}
