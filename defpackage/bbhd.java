package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbhd extends cayv {
    public static final cqce a = cqce.g("Bugle", "RequestLinkPreviewAction");
    public static final dzfh b = new dzfh("LinkPreviewFetchLatency");
    public final fcsu c;
    public final bbgw d;
    public final cogw e;
    public final bxlc f;
    public final bbfn g;
    private final eosc h;
    private final fcsu i;
    private final byeb j;
    private final bbdl k;
    private final afhk l;
    private final dzuc m;
    private final arhq n;
    private final fcsu o;
    private final Context p;

    public bbhd(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, bbgw bbgwVar, byeb byebVar, bbdl bbdlVar, cogw cogwVar, bxlc bxlcVar, bbfn bbfnVar, afhk afhkVar, dzuc dzucVar, arhq arhqVar, fcsu fcsuVar3, Context context) {
        this.h = eoscVar;
        this.c = fcsuVar;
        this.i = fcsuVar2;
        this.d = bbgwVar;
        this.j = byebVar;
        this.k = bbdlVar;
        this.e = cogwVar;
        this.f = bxlcVar;
        this.g = bbfnVar;
        this.l = afhkVar;
        this.m = dzucVar;
        this.n = arhqVar;
        this.o = fcsuVar3;
        this.p = context;
    }

    private final void o(MessageCoreData messageCoreData, String str) {
        bbdl bbdlVar = this.k;
        long jO = messageCoreData.o();
        axcy axcyVarD = bbdlVar.d();
        List listSingletonList = Collections.singletonList(axcyVarD.a());
        this.j.k(Optional.empty(), messageCoreData.A(), axcyVarD, axcyVarD.a(), listSingletonList, 210, 1 + jO, -1L);
        p(messageCoreData, str);
        afhk afhkVar = this.l;
        if (afhkVar.a() == -1) {
            afhkVar.a.d(jO);
        }
    }

    private final void p(MessageCoreData messageCoreData, String str) {
        String[] strArr = bpxj.a;
        bpvi bpviVar = new bpvi();
        bpviVar.n(messageCoreData.C());
        bpviVar.o(str);
        bpviVar.f(messageCoreData.o());
        ((bbfz) this.c.b()).b(bpviVar.a(), messageCoreData.A());
    }

    private final void q(ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        String[] strArr = bpxj.a;
        bpvi bpviVar = new bpvi();
        bpviVar.n(messageIdType);
        bpviVar.o(str);
        bpviVar.f(Long.MAX_VALUE);
        bpviVar.l(true);
        ((bbfz) this.c.b()).b(bpviVar.a(), conversationIdType);
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(4);
        pzh pzhVar = new pzh();
        pzhVar.c = true;
        pzhVar.c(2);
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.a = pzhVar.a();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxkVar.c = elgm.REQUEST_LINK_PREVIEW_ACTION;
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RequestLinkPreviewHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cawc.a.getParserForType();
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x02a4  */
    @Override // defpackage.cayv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ defpackage.eiju j(defpackage.cayy r13, defpackage.evuh r14) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbhd.j(cayy, evuh):eiju");
    }

    public final void k(dzub dzubVar, dzua dzuaVar) {
        if (dzubVar != null) {
            this.m.f(dzubVar, b, null, dzuaVar);
        }
    }

    public final void l(ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        String[] strArr = bpxj.a;
        bpvi bpviVar = new bpvi();
        bpviVar.n(messageIdType);
        bpviVar.o(str);
        bpviVar.f(Long.MAX_VALUE);
        bpviVar.k(true);
        ((bbfz) this.c.b()).b(bpviVar.a(), conversationIdType);
    }

    public final boolean m(MessageIdType messageIdType) {
        Optional optionalC = bbfz.c(messageIdType);
        return optionalC.isPresent() && this.d.f((bpvd) optionalC.get());
    }

    public final void n(MessageIdType messageIdType, int i, int i2) {
        MessageCoreData messageCoreDataW = ((baxe) this.i.b()).w(messageIdType);
        if (messageCoreDataW == null) {
            return;
        }
        this.d.g(messageCoreDataW, i, i2);
    }
}
