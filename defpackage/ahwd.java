package defpackage;

import android.content.Context;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/RestoreWorkflowSettingsService");
    public final fcyh b;
    public final fcsu c;
    public final cogw d;
    public final fdjx e;
    public final Context f;
    public final fcsu g;
    public final fdjx h;
    public final awgx i;
    public final ahzu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;

    public ahwd(fcyh fcyhVar, fcsu fcsuVar, cogw cogwVar, fdjx fdjxVar, Context context, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar2, awgx awgxVar, fcsu fcsuVar5, ahzv ahzvVar) {
        fcyhVar.getClass();
        fcsuVar.getClass();
        cogwVar.getClass();
        fdjxVar.getClass();
        context.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar2.getClass();
        awgxVar.getClass();
        fcsuVar5.getClass();
        ahzvVar.getClass();
        this.b = fcyhVar;
        this.c = fcsuVar;
        this.d = cogwVar;
        this.e = fdjxVar;
        this.f = context;
        this.k = fcsuVar2;
        this.g = fcsuVar3;
        this.l = fcsuVar4;
        this.h = fdjxVar2;
        this.i = awgxVar;
        this.m = fcsuVar5;
        this.j = ahzvVar.a(a, null, null);
    }

    public static final long A(final UUID uuid) {
        btqt btqtVarA = btqy.a();
        btqtVarA.A("getRestoreWorkflowExecutionIdSync");
        btqtVarA.c(new Function() { // from class: ahtz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btqx btqxVar = (btqx) obj;
                btqxVar.b(Optional.of(uuid));
                return btqxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btor btorVar = (btor) btqtVarA.b().l();
        if (btorVar != null) {
            return btorVar.k();
        }
        throw new ahui(uuid);
    }

    public static final void B(btqx btqxVar) {
        aiaf aiafVar = aiaf.COMPLETE_SUCCESS;
        btqxVar.ap(new dqty("restore_workflow_executions.status", 9, Integer.valueOf(aiafVar == null ? 0 : aiafVar.q)));
    }

    public static final boolean x(btor btorVar) {
        return btorVar.n().compareTo(aiaf.COMPLETE_SUCCESS) < 0;
    }

    public static final ahto y(btor btorVar) {
        btorVar.aA(1, "session_id");
        Object objOrElseThrow = btorVar.b.orElseThrow();
        objOrElseThrow.getClass();
        UUID uuid = (UUID) objOrElseThrow;
        aiaf aiafVarN = btorVar.n();
        aiafVarN.getClass();
        btorVar.aA(2, "feature");
        aiba aibaVar = btorVar.c;
        aibaVar.getClass();
        btorVar.aA(4, "start_time");
        Instant instant = btorVar.e;
        instant.getClass();
        btorVar.aA(5, "finish_time");
        Instant instant2 = btorVar.f;
        aiaa aiaaVarM = btorVar.m();
        btorVar.aA(7, "initial_messages_version");
        long j = btorVar.h;
        btorVar.aA(8, "status_timestamp");
        Instant instant3 = btorVar.i;
        instant3.getClass();
        btorVar.aA(9, "last_attachment_request_timestamp");
        Instant instant4 = btorVar.j;
        instant4.getClass();
        btorVar.aA(10, "config");
        aiay aiayVar = btorVar.k;
        if (aiayVar == null) {
            aiayVar = aiay.a;
            aiayVar.getClass();
        }
        btorVar.aA(11, "cleaned_up");
        return new ahto(uuid, aibaVar, aiafVarN, instant, instant2, aiaaVarM, j, instant3, instant4, aiayVar, btorVar.l);
    }

    public final File a(UUID uuid, ahzy ahzyVar, String str) {
        return new File(c(uuid), "original_message_" + ahzyVar.d + "_part_" + ahzyVar.c + "." + str);
    }

    public final File b(UUID uuid, ahzy ahzyVar) {
        return a(uuid, ahzyVar, "metadata");
    }

    public final File c(UUID uuid) {
        uuid.getClass();
        File filesDir = this.f.getFilesDir();
        Objects.toString(uuid);
        File file = new File(filesDir, "attachment_restore/".concat(uuid.toString()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final Object d(UUID uuid, aiad aiadVar, fcxy fcxyVar) {
        if (aiadVar.c != 3) {
            throw new IllegalArgumentException("attachmentMetadata must contain field AttachmentMetadata");
        }
        Object objA = fdin.a(eicg.a(this.b), new ahuk(null, this, uuid, aiadVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.Set r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwd.e(java.util.Set, fcxy):java.lang.Object");
    }

    public final Object f(UUID uuid, aiaf aiafVar, fcxy fcxyVar) {
        if (aiafVar.compareTo(aiaf.COMPLETE_SUCCESS) < 0) {
            throw new IllegalArgumentException(a.h(aiafVar, "status [", "] is not a completed status"));
        }
        Object objA = fdin.a(eicg.a(this.b), new ahuo(null, this, uuid, aiafVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ahus
            if (r0 == 0) goto L13
            r0 = r5
            ahus r0 = (defpackage.ahus) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahus r0 = new ahus
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            r0.c = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 == r1) goto L67
        L3a:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L4c
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4c
        L4a:
            r3 = r1
            goto L62
        L4c:
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r5.next()
            ahto r0 = (defpackage.ahto) r0
            aiba r0 = r0.b
            aiba r2 = defpackage.aiba.D2D
            if (r0 != r2) goto L50
        L62:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwd.g(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ahut
            if (r0 == 0) goto L13
            r0 = r6
            ahut r0 = (defpackage.ahut) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahut r0 = new ahut
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            r0.c = r3
            fcyh r6 = r5.b
            fcyh r6 = defpackage.eicg.a(r6)
            ahvs r2 = new ahvs
            r4 = 0
            r2.<init>(r4, r5)
            java.lang.Object r6 = defpackage.fdin.a(r6, r2, r0)
            if (r6 == r1) goto L73
        L46:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L58
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L58
        L56:
            r3 = r1
            goto L6e
        L58:
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r6.next()
            ahto r0 = (defpackage.ahto) r0
            aiba r0 = r0.b
            aiba r2 = defpackage.aiba.D2D
            if (r0 != r2) goto L5c
        L6e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwd.h(fcxy):java.lang.Object");
    }

    public final Object i(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new ahuu(null, this), fcxyVar);
    }

    public final Object j(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new ahux(null, this), fcxyVar);
    }

    public final Object k(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new ahva(null, this), fcxyVar);
    }

    public final Object l(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new ahvd(null, this), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.UUID r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ahvk
            if (r0 == 0) goto L13
            r0 = r7
            ahvk r0 = (defpackage.ahvk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahvk r0 = new ahvk
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcyh r7 = r5.b
            fcyh r7 = defpackage.eicg.a(r7)
            ahvj r2 = new ahvj
            r4 = 0
            r2.<init>(r4, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdin.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwd.m(java.util.UUID, fcxy):java.lang.Object");
    }

    public final Object n(UUID uuid, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new ahvn(null, uuid), fcxyVar);
    }

    public final Object o(UUID uuid, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.b), new ahvr(null, this, uuid), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.ahvw
            if (r0 == 0) goto L13
            r0 = r12
            ahvw r0 = (defpackage.ahvw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ahvw r0 = new ahvw
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r2 = r0.b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.a
            java.util.List r4 = (java.util.List) r4
            defpackage.fctl.b(r12)
            goto Lb8
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            java.lang.Object r2 = r0.b
            j$.time.Duration r2 = (j$.time.Duration) r2
            java.lang.Object r4 = r0.a
            j$.time.Instant r4 = (j$.time.Instant) r4
            defpackage.fctl.b(r12)
            goto L72
        L47:
            defpackage.fctl.b(r12)
            cogw r12 = r11.d
            fcsu r2 = r11.l
            j$.time.Instant r12 = r12.f()
            java.lang.Object r2 = r2.b()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            j$.time.Duration r2 = j$.time.Duration.ofDays(r5)
            r0.a = r12
            r0.b = r2
            r0.e = r4
            java.lang.Object r4 = r11.i(r0)
            if (r4 == r1) goto Ld6
            r10 = r4
            r4 = r12
            r12 = r10
        L72:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r12 = r12.iterator()
        L7d:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto La3
            java.lang.Object r6 = r12.next()
            r7 = r6
            ahto r7 = (defpackage.ahto) r7
            aiaf r8 = r7.c
            aiaf r9 = defpackage.aiaf.WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN
            if (r8 != r9) goto L7d
            r4.getClass()
            j$.time.Instant r7 = r7.h
            j$.time.Duration r7 = defpackage.eooc.a(r4, r7)
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L7d
            r5.add(r6)
            goto L7d
        La3:
            ahzu r12 = r11.j
            int r2 = r5.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            java.lang.String r2 = "Marking %s executions with initial prompt shown as ready for reprompt"
            r12.h(r2, r4)
            java.util.Iterator r2 = r5.iterator()
            r4 = r5
        Lb8:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto Ld5
            java.lang.Object r12 = r2.next()
            ahto r12 = (defpackage.ahto) r12
            java.util.UUID r12 = r12.a
            aiaf r5 = defpackage.aiaf.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT
            r0.a = r4
            r0.b = r2
            r0.e = r3
            java.lang.Object r12 = r11.s(r12, r5, r0)
            if (r12 != r1) goto Lb8
            goto Ld6
        Ld5:
            return r4
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwd.p(fcxy):java.lang.Object");
    }

    public final Object q(long j, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.b), new ahvx(null, j), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        if (defpackage.fdin.a(r11, r4, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.util.UUID r11, defpackage.aiba r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwd.r(java.util.UUID, aiba, fcxy):java.lang.Object");
    }

    public final Object s(UUID uuid, aiaf aiafVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.b), new ahwc(null, this, uuid, aiafVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final void t(UUID uuid, aiaf aiafVar, fdap fdapVar) {
        if (!((arjl) this.m.b()).a()) {
            String[] strArr = btqy.a;
            btqv btqvVar = new btqv();
            btqvVar.ap("runUpdateExecutionStatus");
            btqvVar.c(aiafVar);
            btqvVar.d(this.d.f());
            ((btqv) fdapVar.invoke(btqvVar)).a(Optional.of(uuid));
            return;
        }
        synchronized (this) {
            String[] strArr2 = btqy.a;
            btqv btqvVar2 = new btqv();
            btqvVar2.ap("runUpdateExecutionStatus");
            btqvVar2.c(aiafVar);
            btqvVar2.d(this.d.f());
            ((btqv) fdapVar.invoke(btqvVar2)).a(Optional.of(uuid));
        }
    }

    public final void u(final UUID uuid, final aiad aiadVar) {
        uuid.getClass();
        if (aiadVar.c != 2) {
            throw new IllegalArgumentException("databaseMetadata must contain field BackupDatabaseMetadata");
        }
        btqt btqtVarA = btqy.a();
        btqtVarA.A("setDatabaseFileMetadataSync");
        btqtVarA.c(new Function() { // from class: ahua
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btqx btqxVar = (btqx) obj;
                btqxVar.b(Optional.of(uuid));
                return btqxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final btor btorVar = (btor) btqtVarA.b().l();
        if (btorVar == null) {
            throw new ahui(uuid);
        }
        if (!x(btorVar)) {
            throw new IllegalStateException(a.h(uuid, "restore execution [", "] already is not active"));
        }
        if (btorVar.m() != null) {
            throw new IllegalStateException(a.h(uuid, "restore execution [", "] already has database metadata"));
        }
        ((dqsn) this.c.b()).d("setDatabaseFileMetadataSync", new Runnable() { // from class: ahub
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = btqy.a;
                btqv btqvVar = new btqv();
                btqvVar.ap("setDatabaseFileMetadataSync");
                aiad aiadVar2 = aiadVar;
                aiaa aiaaVar = aiadVar2.c == 2 ? (aiaa) aiadVar2.d : aiaa.a;
                if (aiaaVar == null) {
                    btqvVar.a.putNull("backup_database_metadata");
                } else {
                    btqvVar.a.put("backup_database_metadata", aiaaVar.toByteArray());
                }
                btor btorVar2 = btorVar;
                btqvVar.a(Optional.of(uuid));
                String[] strArr2 = btsn.a;
                btrh btrhVar = new btrh();
                btrhVar.f(btorVar2.k());
                btrhVar.c(aiadVar2);
                btrhVar.d(btsp.a);
                btrhVar.e(btso.a);
                btrhVar.b();
            }
        });
    }

    public final void v(final UUID uuid, aiaf aiafVar) throws IOException {
        btqt btqtVarA = btqy.a();
        btqtVarA.A("updateExecutionStatusQuery");
        btqtVarA.c(new Function() { // from class: ahue
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btqx btqxVar = (btqx) obj;
                btqxVar.b(Optional.of(uuid));
                return btqxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = btqtVarA.b().p();
        try {
            if (((btpx) dqqjVarP).getCount() == 0) {
                throw new ahui(uuid);
            }
            fczl.a(dqqjVarP, null);
            t(uuid, aiafVar, new fdap() { // from class: ahtv
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    btqv btqvVar = (btqv) obj;
                    btqvVar.getClass();
                    return btqvVar;
                }
            });
        } finally {
        }
    }

    public final void w(final UUID uuid, final aiaf aiafVar) {
        uuid.getClass();
        aiafVar.getClass();
        ((dqsn) this.c.b()).d("updateExecutionStatusSync", new Runnable() { // from class: ahug
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.a.v(uuid, aiafVar);
            }
        });
    }

    public final Object z(UUID uuid) {
        Instant instantF = this.d.f();
        String[] strArr = btqy.a;
        btqv btqvVar = new btqv();
        int iIntValue = btqy.c().intValue();
        int iIntValue2 = btqy.c().intValue();
        if (iIntValue2 < 60330) {
            dqru.x("last_attachment_request_timestamp", iIntValue2);
        }
        if (iIntValue >= 60330) {
            if (instantF == null) {
                btqvVar.a.putNull("last_attachment_request_timestamp");
            } else {
                btqvVar.a.put("last_attachment_request_timestamp", Long.valueOf(bart.a(instantF)));
            }
        }
        btqvVar.a(Optional.of(uuid));
        return fctx.a;
    }
}
