package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atye extends cayv {
    private static final cqce a = cqce.g("BugleDataModel", "RevokeChatMessageResponseHandler");
    private final cden b;
    private final axyh c;

    public atye(axyh axyhVar, cden cdenVar) {
        this.c = axyhVar;
        this.b = cdenVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RevokeChatMessageResponseHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return augq.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        try {
            basd basdVarA = basd.a(((augs) evsn.parseFrom(augs.a, ((augq) evuhVar).d, evrr.a())).c);
            if (!basdVarA.f().isEmpty()) {
                return this.c.b(basdVarA).p().h(new ejvr() { // from class: atyd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return cbcw.i();
                    }
                }, eoqg.a);
            }
            a.r("RevokeChatMessageResponse.opaque_data contained empty messageId");
            return eijx.e(cbcw.k());
        } catch (evtj e) {
            a.s("Unable to decode RevokeChatMessageResponse.opaque_data", e);
            return this.b.b(e).h(new ejvr() { // from class: atyc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return cbcw.k();
                }
            }, eoqg.a);
        }
    }
}
