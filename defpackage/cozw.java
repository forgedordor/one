package defpackage;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cozw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/transport/SimChatTransportManager");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final AtomicBoolean f;
    private final AtomicReference g;

    public cozw(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        new eizx();
        this.f = new AtomicBoolean(false);
        this.g = new AtomicReference(ekoj.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0154, code lost:
    
        if ((r6 instanceof defpackage.cozr) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        r0 = r4.j();
        r0.X(r7, "BugleTransport");
        r0 = (defpackage.ekrd) r0;
        r4 = defpackage.cqnc.ad;
        r6 = ((defpackage.cozr) r6).a;
        r0.X(r4, r6);
        ((defpackage.ekrd) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 53, "ChatTransportSelector.kt")).q("Fallback to selecting single Tachygram SIM as eligible for registration, despite multiple sims available.");
        r0 = defpackage.fcwa.c(new defpackage.fcti(r6, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0187, code lost:
    
        if ((r6 instanceof defpackage.cozq) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0189, code lost:
    
        r0 = r4.j();
        r0.X(r7, "BugleTransport");
        r0 = (defpackage.ekrd) r0;
        r4 = defpackage.cqnc.ad;
        r6 = (defpackage.cozq) r6;
        r5 = r6.a;
        r0.X(r4, r5);
        ((defpackage.ekrd) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 62, "ChatTransportSelector.kt")).q("Fallback to selecting single NON-Tachygram SIM as eligible for registration, despite multiple sims available.");
        r0 = defpackage.fcwa.c(new defpackage.fcti(r5, r6.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bc, code lost:
    
        if ((r6 instanceof defpackage.cozp) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01be, code lost:
    
        r0 = r4.h();
        r0.X(r7, "BugleTransport");
        ((defpackage.ekrd) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 68, "ChatTransportSelector.kt")).q("No sims are eligible for registration, should never happen.");
        r0 = defpackage.fcvp.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01da, code lost:
    
        defpackage.fczl.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e3, code lost:
    
        throw new defpackage.fctg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9 A[Catch: all -> 0x032f, LOOP:5: B:65:0x01f3->B:67:0x01f9, LOOP_END, TryCatch #6 {, blocks: (B:3:0x0001, B:59:0x01da, B:64:0x01e7, B:65:0x01f3, B:67:0x01f9, B:68:0x0236, B:77:0x027a, B:78:0x029b, B:80:0x02a1, B:81:0x02cb, B:82:0x02d3, B:84:0x02d9, B:87:0x02f5, B:94:0x031d, B:95:0x0320, B:63:0x01e4, B:104:0x032b, B:105:0x032e, B:4:0x000f, B:16:0x006a, B:18:0x0079, B:20:0x0081, B:23:0x0089, B:24:0x008d, B:26:0x0093, B:28:0x009d, B:29:0x00c5, B:31:0x00cb, B:32:0x0108, B:33:0x0113, B:35:0x0119, B:43:0x013a, B:44:0x013f, B:45:0x0140, B:50:0x0152, B:52:0x0156, B:53:0x0185, B:55:0x0189, B:56:0x01ba, B:58:0x01be, B:61:0x01de, B:62:0x01e3, B:47:0x0148, B:49:0x0150, B:99:0x0324, B:100:0x0327, B:5:0x001a, B:6:0x0022, B:8:0x0028, B:9:0x0044, B:11:0x004a, B:13:0x0062, B:97:0x0322, B:102:0x0329, B:69:0x024c, B:71:0x0258, B:72:0x025a, B:74:0x0266, B:76:0x026a, B:92:0x031b), top: B:120:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0258 A[Catch: all -> 0x031a, TryCatch #4 {all -> 0x031a, blocks: (B:69:0x024c, B:71:0x0258, B:72:0x025a, B:74:0x0266, B:76:0x026a), top: B:116:0x024c, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0266 A[Catch: all -> 0x031a, TryCatch #4 {all -> 0x031a, blocks: (B:69:0x024c, B:71:0x0258, B:72:0x025a, B:74:0x0266, B:76:0x026a), top: B:116:0x024c, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026a A[Catch: all -> 0x031a, TRY_LEAVE, TryCatch #4 {all -> 0x031a, blocks: (B:69:0x024c, B:71:0x0258, B:72:0x025a, B:74:0x0266, B:76:0x026a), top: B:116:0x024c, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a1 A[Catch: all -> 0x032f, LOOP:6: B:78:0x029b->B:80:0x02a1, LOOP_END, TryCatch #6 {, blocks: (B:3:0x0001, B:59:0x01da, B:64:0x01e7, B:65:0x01f3, B:67:0x01f9, B:68:0x0236, B:77:0x027a, B:78:0x029b, B:80:0x02a1, B:81:0x02cb, B:82:0x02d3, B:84:0x02d9, B:87:0x02f5, B:94:0x031d, B:95:0x0320, B:63:0x01e4, B:104:0x032b, B:105:0x032e, B:4:0x000f, B:16:0x006a, B:18:0x0079, B:20:0x0081, B:23:0x0089, B:24:0x008d, B:26:0x0093, B:28:0x009d, B:29:0x00c5, B:31:0x00cb, B:32:0x0108, B:33:0x0113, B:35:0x0119, B:43:0x013a, B:44:0x013f, B:45:0x0140, B:50:0x0152, B:52:0x0156, B:53:0x0185, B:55:0x0189, B:56:0x01ba, B:58:0x01be, B:61:0x01de, B:62:0x01e3, B:47:0x0148, B:49:0x0150, B:99:0x0324, B:100:0x0327, B:5:0x001a, B:6:0x0022, B:8:0x0028, B:9:0x0044, B:11:0x004a, B:13:0x0062, B:97:0x0322, B:102:0x0329, B:69:0x024c, B:71:0x0258, B:72:0x025a, B:74:0x0266, B:76:0x026a, B:92:0x031b), top: B:120:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d9 A[Catch: all -> 0x032f, TryCatch #6 {, blocks: (B:3:0x0001, B:59:0x01da, B:64:0x01e7, B:65:0x01f3, B:67:0x01f9, B:68:0x0236, B:77:0x027a, B:78:0x029b, B:80:0x02a1, B:81:0x02cb, B:82:0x02d3, B:84:0x02d9, B:87:0x02f5, B:94:0x031d, B:95:0x0320, B:63:0x01e4, B:104:0x032b, B:105:0x032e, B:4:0x000f, B:16:0x006a, B:18:0x0079, B:20:0x0081, B:23:0x0089, B:24:0x008d, B:26:0x0093, B:28:0x009d, B:29:0x00c5, B:31:0x00cb, B:32:0x0108, B:33:0x0113, B:35:0x0119, B:43:0x013a, B:44:0x013f, B:45:0x0140, B:50:0x0152, B:52:0x0156, B:53:0x0185, B:55:0x0189, B:56:0x01ba, B:58:0x01be, B:61:0x01de, B:62:0x01e3, B:47:0x0148, B:49:0x0150, B:99:0x0324, B:100:0x0327, B:5:0x001a, B:6:0x0022, B:8:0x0028, B:9:0x0044, B:11:0x004a, B:13:0x0062, B:97:0x0322, B:102:0x0329, B:69:0x024c, B:71:0x0258, B:72:0x025a, B:74:0x0266, B:76:0x026a, B:92:0x031b), top: B:120:0x0001, inners: #2, #3, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void c(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cozw.c(java.util.Map):void");
    }

    public final ekgp a() throws IOException {
        eieu eieuVarH = eiiy.h("SimChatTransportManager#simIdToChatTransport");
        try {
            if (!this.f.get()) {
                b(((cozx) this.d.b()).a());
            }
            Object obj = this.g.get();
            obj.getClass();
            ekgp ekgpVar = (ekgp) obj;
            fczl.a(eieuVarH, null);
            return ekgpVar;
        } finally {
        }
    }

    public final void b(Map map) throws IOException {
        eieu eieuVarH = eiiy.h("SimChatTransportManager#populateTransportRegistrationState");
        try {
            c(map);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }
}
