package com.google.android.apps.messaging.wearable;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.a;
import defpackage.auvh;
import defpackage.babw;
import defpackage.cqnc;
import defpackage.ctam;
import defpackage.ctap;
import defpackage.ctbe;
import defpackage.ctbf;
import defpackage.ctbg;
import defpackage.cvw;
import defpackage.dapb;
import defpackage.dcji;
import defpackage.defe;
import defpackage.defh;
import defpackage.defn;
import defpackage.defr;
import defpackage.degc;
import defpackage.denu;
import defpackage.drgf;
import defpackage.drgi;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.eiko;
import defpackage.ejvr;
import defpackage.ejxm;
import defpackage.ekcv;
import defpackage.ekgb;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.eooz;
import defpackage.fcsu;
import defpackage.fdgn;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WearableBindService extends dapb {
    public static final eksp a = eksp.c("BugleWearable");
    public fcsu A;
    public fcsu B;
    public fcsu C;
    public fcsu D;
    public cvw b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public fcsu j;
    public fcsu k;
    public fcsu l;
    public fcsu m;
    public fcsu n;
    public fcsu o;
    public fcsu p;
    public fcsu q;
    public fcsu r;
    public fcsu s;
    public fcsu t;
    public fcsu u;
    public fcsu v;
    public fcsu w;
    public fcsu x;
    public fcsu y;
    public fcsu z;

    public static defn c() {
        ctbe ctbeVar = (ctbe) ctbg.a.createBuilder();
        ctbeVar.copyOnWrite();
        ((ctbg) ctbeVar.instance).d = ctbf.a(4);
        return degc.c(((ctbg) ctbeVar.build()).toByteArray());
    }

    private final eiju q() {
        return ((ctap) this.C.b()).a().h(new ejvr() { // from class: dapq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarN = WearableBindService.a.n();
                ekrwVarN.X(cqnc.S, "WearableBindService");
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/wearable/WearableBindService", "markPairedWatchAsOnline", 439, "WearableBindService.java")).t("Updated connection status of the paired watch to %s", (ctao) obj);
                return null;
            }
        }, (Executor) this.u.b());
    }

    private final void r(final ChannelClient.Channel channel, final Uri uri) {
        eijx.f(new Runnable() { // from class: dapk
            @Override // java.lang.Runnable
            public final void run() {
                WearableBindService wearableBindService = this.a;
                cvw cvwVar = wearableBindService.b;
                ChannelClient.Channel channel2 = channel;
                babw babwVar = (babw) cvwVar.remove(channel2);
                if (babwVar != null && babwVar.g()) {
                    babwVar.f();
                }
                Uri uri2 = uri;
                babw babwVar2 = new babw();
                bxfw bxfwVarF = new bxhb(uri2, 250, 250, -1, -1, false, false, false, 0, true).f(wearableBindService, new daps(wearableBindService, babwVar2, channel2, uri2));
                babwVar2.c(bxfwVarF);
                wearableBindService.b.put(channel2, babwVar2);
                ((bxgr) wearableBindService.l.b()).d(bxfwVarF);
            }
        }, (Executor) this.v.b()).k(auvh.b(), (Executor) this.u.b());
    }

    public final defn b(eiju eijuVar) {
        final defr defrVar = new defr();
        eijuVar.h(new ejvr() { // from class: dapj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = WearableBindService.a;
                defrVar.b(((ctbg) obj).toByteArray());
                return null;
            }
        }, (Executor) this.u.b()).k(auvh.b(), (Executor) this.u.b());
        return defrVar.a;
    }

    @Override // defpackage.deph, defpackage.deod
    public final defn d(final String str, final String str2, final byte[] bArr) {
        eieh eiehVarC = ((eigp) this.q.b()).c("WearableBindService#onRequest", "com/google/android/apps/messaging/wearable/WearableBindService", "onRequest", 361);
        try {
            defn defnVarA = drgf.a(q().i(new eooz() { // from class: dape
                /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
                @Override // defpackage.eooz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r14) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 491
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dape.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, (Executor) this.u.b()));
            eiehVarC.close();
            return defnVarA;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.defn e(java.lang.String r12, defpackage.denz r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.wearable.WearableBindService.e(java.lang.String, denz, java.lang.String):defn");
    }

    public final eiju f(ChannelClient.Channel channel) {
        return eiju.g(drgi.a(((ChannelClient) this.d.b()).a(channel)));
    }

    public final void g(defn defnVar, final String str, final String str2, final ejxm ejxmVar) {
        defnVar.a(eiko.b(new defh() { // from class: dapf
            @Override // defpackage.defh
            public final void e(Object obj) {
                ejxm ejxmVar2 = ejxmVar;
                ejxmVar2.g();
                ctam ctamVar = (ctam) this.a.s.b();
                String str3 = str;
                Duration durationD = ejxmVar2.d();
                str3.getClass();
                String str4 = str2;
                str4.getClass();
                durationD.getClass();
                if (ctamVar.b()) {
                    ctamVar.c(9, str3, str4, durationD, ctam.b);
                }
            }
        }));
        defnVar.t(eiko.a(new defe() { // from class: dapg
            @Override // defpackage.defe
            public final void d(Exception exc) {
                ejxm ejxmVar2 = ejxmVar;
                ejxmVar2.g();
                this.a.h("Failed to handle RPC for path", exc, str, str2, ejxmVar2.d());
            }
        }));
    }

    public final void h(String str, Throwable th, String str2, String str3, Duration duration) {
        eksl ekslVar = (eksl) a.j();
        ekslVar.X(cqnc.S, "WearableBindService");
        ((eksl) ((eksl) ekslVar.g(th)).h("com/google/android/apps/messaging/wearable/WearableBindService", "logRequestReceiveFailure", 983, "WearableBindService.java")).D("%s: %s", str, str2);
        ctam ctamVar = (ctam) this.s.b();
        str2.getClass();
        str3.getClass();
        duration.getClass();
        if (ctamVar.b()) {
            ctamVar.c(9, str2, str3, duration, ctamVar.a(th));
        }
    }

    @Override // defpackage.deph
    public final void i(ChannelClient.Channel channel) {
        eieh eiehVarC = ((eigp) this.q.b()).c("WearableBindService#onChannelOpened", "com/google/android/apps/messaging/wearable/WearableBindService", "onChannelOpened", 628);
        try {
            String strA = channel.a();
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.S, "WearableBindService");
            ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onChannelOpened", 633, "WearableBindService.java")).t("#onChannelOpened path: %s", strA);
            if (fdgn.G(strA, "#", false)) {
                String strA2 = channel.a();
                String strSubstring = strA2.substring(fdgn.V(strA2, "#") + 1);
                strSubstring.getClass();
                int i = Integer.parseInt(strSubstring);
                String strSubstring2 = strA2.substring(0, fdgn.V(strA2, "#"));
                strSubstring2.getClass();
                final Uri uri = Uri.parse(strSubstring2);
                uri.getClass();
                if (i == 0) {
                    r(channel, uri);
                } else {
                    if (i != 2) {
                        throw new IllegalArgumentException(a.g(i, "Unsupported content type: "));
                    }
                    f(channel).k(auvh.c(new Consumer() { // from class: dapi
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) throws IOException {
                            WearableBindService wearableBindService = this.a;
                            Uri uri2 = uri;
                            OutputStream outputStream = (OutputStream) obj;
                            try {
                                try {
                                    elec.a(ebsv.b((Context) wearableBindService.c.b(), uri2, ebsu.a("com.android.providers.telephony")), outputStream);
                                    ((ains) wearableBindService.t.b()).c("Bugle.Wear.VoiceMessage.Process.Success");
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                } finally {
                                }
                            } catch (IOException e) {
                                eksl ekslVar2 = (eksl) WearableBindService.a.j();
                                ekslVar2.X(cqnc.S, "WearableBindService");
                                ((eksl) ((eksl) ekslVar2.g(e)).h("com/google/android/apps/messaging/wearable/WearableBindService", "processAudioRequest", 729, "WearableBindService.java")).t("Failed to copy audio stream for file: %s", uri2);
                                ((ains) wearableBindService.t.b()).c("Bugle.Wear.VoiceMessage.Process.Failure");
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), (Executor) this.v.b());
                }
            } else {
                r(channel, Uri.parse(strA));
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.deph, defpackage.denq
    public final void j(denu denuVar) {
        eieh eiehVarC = ((eigp) this.q.b()).c("WearableBindService#onDataChanged", "com/google/android/apps/messaging/wearable/WearableBindService", "onDataChanged", 220);
        try {
            Stream map = StreamSupport.stream(Spliterators.spliteratorUnknownSize(new dcji(denuVar), 16), false).filter(new Predicate() { // from class: dapm
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    eksp ekspVar = WearableBindService.a;
                    String path = ((dent) obj).b().a().getPath();
                    return Objects.equals(path, "/bugle/watch_version/") || Objects.equals(path, "/bugle/attachments/");
                }
            }).map(new Function() { // from class: dapn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (dent) ((dent) obj).d();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
            denuVar.b();
            if (!ekgbVar.isEmpty()) {
                auvh.h(q().h(new ejvr() { // from class: dapo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekgb ekgbVar2 = ekgbVar;
                        int size = ekgbVar2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            dent dentVar = (dent) ekgbVar2.get(i2);
                            denv denvVarB = dentVar.b();
                            String path = denvVarB.a().getPath();
                            if ("/bugle/watch_version/".equals(path)) {
                                CheckWearableAppVersionAction.h();
                            } else if (dentVar.a() == 1 && "/bugle/attachments/".equals(path)) {
                                final WearableBindService wearableBindService = this.a;
                                final denz denzVar = deoa.a(denvVarB).a;
                                String strB = cszr.b(denzVar, "39");
                                ctam ctamVar = (ctam) wearableBindService.s.b();
                                path.getClass();
                                if (ctamVar.b()) {
                                    ctamVar.c(5, path, strB, null, ctamVar.a(new dcff(new Status(0))));
                                }
                                final ConversationIdType conversationIdTypeB = barn.b(cszr.a(denzVar, "1"));
                                String strA = cszr.a(denzVar, "26");
                                if (le.f(strA)) {
                                    Asset assetB = denzVar.b("27");
                                    if (assetB == null) {
                                        eksl ekslVar = (eksl) WearableBindService.a.j();
                                        ekslVar.X(cqnc.S, "WearableBindService");
                                        ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 291, "WearableBindService.java")).q("Asset is null, sending voice message stopped.");
                                    } else {
                                        final Uri uriD = bxlf.d(true != ((Boolean) aonl.a.e()).booleanValue() ? "amr" : "m4a", (Context) wearableBindService.c.b());
                                        if (uriD == null) {
                                            eksl ekslVar2 = (eksl) WearableBindService.a.j();
                                            ekslVar2.X(cqnc.S, "WearableBindService");
                                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 302, "WearableBindService.java")).q("Creating Uri failed, sending voice message stopped.");
                                        } else {
                                            File fileH = bxlf.h(uriD, (Context) wearableBindService.c.b());
                                            if (fileH == null) {
                                                eksl ekslVar3 = (eksl) WearableBindService.a.j();
                                                ekslVar3.X(cqnc.S, "WearableBindService");
                                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendAudioAttachment", 312, "WearableBindService.java")).q("Unable to create the scratch file, sending voice message stopped.");
                                            } else {
                                                final Path path2 = FileRetargetClass.toPath(fileH);
                                                auvh.h(eiju.g(drgi.a(((dens) wearableBindService.e.b()).d(assetB))).h(new ejvr() { // from class: dapp
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj2) throws IOException {
                                                        WearableBindService wearableBindService2 = wearableBindService;
                                                        Path path3 = path2;
                                                        try {
                                                            InputStream inputStreamA = ((denr) obj2).a();
                                                            try {
                                                                Files.copy(inputStreamA, path3, StandardCopyOption.REPLACE_EXISTING);
                                                                ((dens) wearableBindService2.e.b()).a(new Uri.Builder().scheme("wear").path("/bugle/attachments/").build());
                                                                if (inputStreamA == null) {
                                                                    return null;
                                                                }
                                                                inputStreamA.close();
                                                                return null;
                                                            } finally {
                                                            }
                                                        } catch (IOException e) {
                                                            eksl ekslVar4 = (eksl) ((eksl) WearableBindService.a.j()).g(e);
                                                            ekslVar4.X(cqnc.S, "WearableBindService");
                                                            ((eksl) ekslVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "saveMediaFileToPath", 351, "WearableBindService.java")).t("Failed to get asset from %s. Sending voice message stopped.", path3);
                                                            return null;
                                                        }
                                                    }
                                                }, (Executor) wearableBindService.v.b()).h(new ejvr() { // from class: dapr
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj2) {
                                                        denz denzVar2 = denzVar;
                                                        Object obj3 = denzVar2.a.get("42");
                                                        long jLongValue = 0;
                                                        if (obj3 != null) {
                                                            try {
                                                                jLongValue = ((Long) obj3).longValue();
                                                            } catch (ClassCastException e) {
                                                                denz.q("42", obj3, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, e);
                                                            }
                                                        }
                                                        long j = jLongValue;
                                                        Uri uri = uriD;
                                                        ConversationIdType conversationIdType = conversationIdTypeB;
                                                        WearableBindService wearableBindService2 = wearableBindService;
                                                        ((ayjk) wearableBindService2.m.b()).a(conversationIdType, uri, j, cszr.a(denzVar2, "26"));
                                                        return null;
                                                    }
                                                }, (Executor) wearableBindService.u.b()));
                                            }
                                        }
                                    }
                                } else {
                                    eksl ekslVar4 = (eksl) WearableBindService.a.j();
                                    ekslVar4.X(cqnc.S, "WearableBindService");
                                    ((eksl) ekslVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "onDataChangedInner", 279, "WearableBindService.java")).t("Invalid attachment type: %s", strA);
                                }
                            }
                        }
                        return null;
                    }
                }, (Executor) this.w.b()));
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.deph, defpackage.deoc
    public final void k(final MessageEventParcelable messageEventParcelable) {
        eieh eiehVarC = ((eigp) this.q.b()).c("WearableBindService#onMessageReceived", "com/google/android/apps/messaging/wearable/WearableBindService", "onMessageReceived", 395);
        try {
            auvh.h(q().h(new ejvr() { // from class: dapl
                @Override // defpackage.ejvr
                public final Object apply(Object obj) throws IOException {
                    WearableBindService wearableBindService = this.a;
                    boolean zJ = ((crma) wearableBindService.j.b()).j();
                    eksl ekslVar = (eksl) WearableBindService.a.h();
                    ekslVar.X(cqnc.S, "WearableBindService");
                    eksl ekslVar2 = (eksl) ekslVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onMessageReceivedInner", 414, "WearableBindService.java");
                    MessageEventParcelable messageEventParcelable2 = messageEventParcelable;
                    String str = messageEventParcelable2.b;
                    ekslVar2.E("#onMessageReceived path: %s, hasRequiredPermissions: %s", str, zJ);
                    ((ctak) wearableBindService.r.b()).a(str);
                    byte[] bArr = messageEventParcelable2.c;
                    String strB = cszr.b(denz.c(bArr), "39");
                    ctam ctamVar = (ctam) wearableBindService.s.b();
                    str.getClass();
                    if (ctamVar.b()) {
                        ctamVar.c(3, str, strB, null, ctam.b);
                    }
                    wearableBindService.e(str, denz.c(bArr), messageEventParcelable2.d);
                    return null;
                }
            }, (Executor) this.u.b()));
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.deph
    public final void l(ChannelClient.Channel channel) {
        eieh eiehVarC = ((eigp) this.q.b()).c("WearableBindService#onChannelClosed", "com/google/android/apps/messaging/wearable/WearableBindService", "onChannelClosed", 808);
        try {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.S, "WearableBindService");
            ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "onChannelClosed", 812, "WearableBindService.java")).t("#onChannelClosed path: %s", channel.a());
            babw babwVar = (babw) this.b.remove(channel);
            if (babwVar != null && babwVar.g()) {
                babwVar.f();
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dapb, defpackage.deph, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new cvw();
    }
}
