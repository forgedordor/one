package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadb implements Comparable {
    public static final eada a = new eada();
    public final dzyn c;
    public final String d;
    public final boolean g;
    public final boolean h;
    public final eafa j;
    private final Set k;
    public final String e = "";
    public final boolean f = false;
    public volatile eaez b = null;
    public final eadn i = new eadn();

    public eadb(dzyn dzynVar, String str, boolean z, boolean z2, Set set) {
        this.c = dzynVar;
        this.d = str;
        this.g = z;
        this.h = z2;
        this.k = set;
        this.j = new eafa(dzynVar, str, "", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0194 A[Catch: all -> 0x028e, TryCatch #6 {all -> 0x028e, blocks: (B:8:0x000d, B:10:0x0014, B:12:0x001e, B:13:0x002e, B:15:0x0047, B:42:0x0190, B:44:0x0194, B:45:0x019f, B:46:0x01a6, B:48:0x01c7, B:50:0x01e0, B:51:0x01ef, B:17:0x0053, B:19:0x005b, B:21:0x0069, B:23:0x0087, B:24:0x0094, B:25:0x009c, B:27:0x011e, B:37:0x0169, B:38:0x016c, B:33:0x0145, B:40:0x016e), top: B:88:0x000d, outer: #2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #6 {all -> 0x028e, blocks: (B:8:0x000d, B:10:0x0014, B:12:0x001e, B:13:0x002e, B:15:0x0047, B:42:0x0190, B:44:0x0194, B:45:0x019f, B:46:0x01a6, B:48:0x01c7, B:50:0x01e0, B:51:0x01ef, B:17:0x0053, B:19:0x005b, B:21:0x0069, B:23:0x0087, B:24:0x0094, B:25:0x009c, B:27:0x011e, B:37:0x0169, B:38:0x016c, B:33:0x0145, B:40:0x016e), top: B:88:0x000d, outer: #2, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206 A[Catch: all -> 0x0295, TryCatch #2 {, blocks: (B:5:0x0005, B:7:0x0009, B:52:0x01fd, B:54:0x0206, B:56:0x0211, B:58:0x0219, B:60:0x0221, B:68:0x0281, B:70:0x0285, B:72:0x028b, B:61:0x0238, B:63:0x0260, B:64:0x026c, B:66:0x0274, B:74:0x028f, B:75:0x0292, B:76:0x0293, B:8:0x000d, B:10:0x0014, B:12:0x001e, B:13:0x002e, B:15:0x0047, B:42:0x0190, B:44:0x0194, B:45:0x019f, B:46:0x01a6, B:48:0x01c7, B:50:0x01e0, B:51:0x01ef, B:17:0x0053, B:19:0x005b, B:21:0x0069, B:23:0x0087, B:24:0x0094, B:25:0x009c, B:27:0x011e, B:37:0x0169, B:38:0x016c, B:33:0x0145, B:40:0x016e), top: B:84:0x0005, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0285 A[Catch: all -> 0x0295, TryCatch #2 {, blocks: (B:5:0x0005, B:7:0x0009, B:52:0x01fd, B:54:0x0206, B:56:0x0211, B:58:0x0219, B:60:0x0221, B:68:0x0281, B:70:0x0285, B:72:0x028b, B:61:0x0238, B:63:0x0260, B:64:0x026c, B:66:0x0274, B:74:0x028f, B:75:0x0292, B:76:0x0293, B:8:0x000d, B:10:0x0014, B:12:0x001e, B:13:0x002e, B:15:0x0047, B:42:0x0190, B:44:0x0194, B:45:0x019f, B:46:0x01a6, B:48:0x01c7, B:50:0x01e0, B:51:0x01ef, B:17:0x0053, B:19:0x005b, B:21:0x0069, B:23:0x0087, B:24:0x0094, B:25:0x009c, B:27:0x011e, B:37:0x0169, B:38:0x016c, B:33:0x0145, B:40:0x016e), top: B:84:0x0005, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028b A[Catch: all -> 0x0295, TryCatch #2 {, blocks: (B:5:0x0005, B:7:0x0009, B:52:0x01fd, B:54:0x0206, B:56:0x0211, B:58:0x0219, B:60:0x0221, B:68:0x0281, B:70:0x0285, B:72:0x028b, B:61:0x0238, B:63:0x0260, B:64:0x026c, B:66:0x0274, B:74:0x028f, B:75:0x0292, B:76:0x0293, B:8:0x000d, B:10:0x0014, B:12:0x001e, B:13:0x002e, B:15:0x0047, B:42:0x0190, B:44:0x0194, B:45:0x019f, B:46:0x01a6, B:48:0x01c7, B:50:0x01e0, B:51:0x01ef, B:17:0x0053, B:19:0x005b, B:21:0x0069, B:23:0x0087, B:24:0x0094, B:25:0x009c, B:27:0x011e, B:37:0x0169, B:38:0x016c, B:33:0x0145, B:40:0x016e), top: B:84:0x0005, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eaez a() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eadb.a():eaez");
    }

    public final void b() {
        final eafa eafaVar = this.j;
        final ListenableFuture listenableFutureA = eafaVar.a(this.e);
        eooz eoozVar = new eooz() { // from class: eacr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return eafaVar.b((eafc) obj);
            }
        };
        dzyn dzynVar = this.c;
        eooq.g(listenableFutureA, eoozVar, dzynVar.e()).b(new Runnable() { // from class: eacs
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(listenableFutureA);
            }
        }, dzynVar.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: CancellationException -> 0x0067, CancellationException | ExecutionException -> 0x0069, TryCatch #3 {CancellationException | ExecutionException -> 0x0069, blocks: (B:2:0x0000, B:4:0x0016, B:12:0x0023, B:14:0x002d, B:16:0x0039, B:20:0x0040, B:22:0x0049, B:6:0x001a, B:26:0x0066), top: B:35:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(com.google.common.util.concurrent.ListenableFuture r4) {
        /*
            r3 = this;
            java.lang.Object r4 = defpackage.eork.q(r4)     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            eafc r4 = (defpackage.eafc) r4     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            eaey r0 = new eaey     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            r1 = 6
            r2 = 2
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            eaez r1 = new eaez     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            r1.<init>(r4, r0)     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            boolean r0 = r3.h     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            if (r0 != 0) goto L1a
            eaez r2 = r3.b     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            if (r2 != 0) goto L23
        L1a:
            monitor-enter(r3)     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            if (r0 != 0) goto L3d
            eaez r2 = r3.b     // Catch: java.lang.Throwable -> L64
            if (r2 != 0) goto L22
            goto L3d
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
        L23:
            ekgp r0 = r2.e     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            ekgp r1 = r1.e     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            boolean r0 = defpackage.ekmi.m(r0, r1)     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            if (r0 != 0) goto L40
            dzyn r4 = r3.c     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            ejxr r4 = r4.e     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            eaep r4 = (defpackage.eaep) r4     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            if (r4 == 0) goto L8c
            r4.a()     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            return
        L3d:
            r3.b = r1     // Catch: java.lang.Throwable -> L64
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
        L40:
            eadn r0 = r3.i     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            boolean r0 = r3.h     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            if (r0 == 0) goto L8c
            dzyn r0 = r3.c     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            eaaa r1 = r0.b()     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            java.lang.String r4 = r4.c     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            com.google.common.util.concurrent.ListenableFuture r4 = r1.a(r4)     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            eacp r2 = new eacp     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            eosd r0 = r0.e()     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            defpackage.eooh.f(r4, r1, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
            return
        L64:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
            throw r4     // Catch: java.util.concurrent.CancellationException -> L67 java.util.concurrent.ExecutionException -> L69
        L67:
            r4 = move-exception
            goto L6a
        L69:
            r4 = move-exception
        L6a:
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L8c
            java.lang.String r0 = r3.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to update local snapshot for "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", may result in stale flags."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "FlagStore"
            android.util.Log.w(r1, r0, r4)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eadb.c(com.google.common.util.concurrent.ListenableFuture):void");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.e.compareTo((String) obj);
    }

    public final void d() {
        ListenableFuture listenableFutureA;
        dzzr dzzrVar;
        eaez eaezVarA = a();
        String str = eaezVarA.b;
        dzyn dzynVar = this.c;
        eaet eaetVarA = dzynVar.f.a(this.g);
        if (eaetVarA.e) {
            if (ejwk.c(str) && !eaetVarA.d) {
                ListenableFuture listenableFuture = eorv.a;
                return;
            }
            dzzn dzznVar = (dzzn) dzzs.a.createBuilder();
            eaey eaeyVar = eaezVarA.f;
            if (eaeyVar.a) {
                dzzrVar = dzzr.a;
            } else {
                dzzo dzzoVar = (dzzo) dzzr.a.createBuilder();
                int i = eaeyVar.b;
                dzzoVar.copyOnWrite();
                dzzr dzzrVar2 = (dzzr) dzzoVar.instance;
                dzzrVar2.c = dzzq.a(i);
                dzzrVar2.b |= 1;
                int i2 = eaeyVar.c;
                dzzoVar.copyOnWrite();
                dzzr dzzrVar3 = (dzzr) dzzoVar.instance;
                dzzrVar3.d = dzzp.a(i2);
                dzzrVar3.b |= 2;
                dzzrVar = (dzzr) dzzoVar.build();
            }
            dzznVar.copyOnWrite();
            dzzs dzzsVar = (dzzs) dzznVar.instance;
            dzzrVar.getClass();
            dzzsVar.d = dzzrVar;
            dzzsVar.b |= 2;
            if (!ejwk.c(str)) {
                dzznVar.copyOnWrite();
                dzzs dzzsVar2 = (dzzs) dzznVar.instance;
                str.getClass();
                dzzsVar2.b |= 1;
                dzzsVar2.c = str;
            }
            if (eaetVarA.d) {
                String str2 = this.d;
                dzznVar.copyOnWrite();
                dzzs dzzsVar3 = (dzzs) dzznVar.instance;
                str2.getClass();
                dzzsVar3.b |= 4;
                dzzsVar3.e = str2;
            }
            listenableFutureA = dzynVar.b().b((dzzs) dzznVar.build());
        } else {
            if (ejwk.c(str)) {
                ListenableFuture listenableFuture2 = eorv.a;
                return;
            }
            listenableFutureA = dzynVar.b().a(str);
        }
        eooh.g(listenableFutureA, eaab.class, new eooz() { // from class: eacq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                int i3 = ((eaab) obj).a;
                if (i3 == 29501 || i3 == 29537 || i3 == 29538 || i3 == 29539 || i3 == 29540 || i3 == 29541 || i3 == 29542 || i3 == 29543 || i3 == 29544) {
                    eadb eadbVar = this.a;
                    if (!eadbVar.j.c()) {
                        eadbVar.b();
                    }
                }
                return eorv.a;
            }
        }, dzynVar.e());
    }
}
