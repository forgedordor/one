package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amzw implements amzy {
    public static final /* synthetic */ int e = 0;
    private static final eksp f = eksp.c("BugleSending");
    public final Optional a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final eosc g;
    private final eosc h;
    private final eosc i;
    private final bveg j;
    private final amwq k;
    private final cjpb l;
    private final fcsu m;
    private final fcsu n;
    private final cogw o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;

    public amzw(eosc eoscVar, eosc eoscVar2, eosc eoscVar3, bveg bvegVar, amwq amwqVar, cjpb cjpbVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cogw cogwVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        this.g = eoscVar;
        this.h = eoscVar2;
        this.i = eoscVar3;
        this.j = bvegVar;
        this.k = amwqVar;
        this.l = cjpbVar;
        this.m = fcsuVar;
        this.c = fcsuVar2;
        this.a = optional;
        this.b = fcsuVar3;
        this.n = fcsuVar4;
        this.o = cogwVar;
        this.d = fcsuVar5;
        this.p = fcsuVar6;
        this.q = fcsuVar7;
        this.r = fcsuVar8;
        this.s = fcsuVar9;
        this.t = fcsuVar10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String e(ekgb ekgbVar) {
        if (ekgbVar.size() != 1) {
            return null;
        }
        amsv amsvVar = ((amzv) ekgbVar.get(0)).a;
        if (amsvVar instanceof amwm) {
            return ((amwm) amsvVar).l();
        }
        return null;
    }

    @Override // defpackage.amzy
    public final eiju a(final anhn anhnVar, final ajlh ajlhVar, final long j, final long j2) {
        eksl ekslVar = (eksl) f.h();
        ekslVar.X(cqnc.t, ajlhVar.f());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/envelope/BugleMessagePackager", "prepareReactionForSending", 288, "BugleMessagePackager.java")).I("Prepare REACTION for sending: %s reaction to message %s from %s.", anhnVar.c(), anhnVar.a().a(), anhnVar.d().name());
        return eijx.g(new Callable() { // from class: amzh
            /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() throws defpackage.ajlf {
                /*
                    Method dump skipped, instructions count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.amzh.call():java.lang.Object");
            }
        }, this.h);
    }

    @Override // defpackage.amzy
    public final eiju b(final ajlh ajlhVar, final MessageId messageId, final long j, final long j2, final String str, final fhaz fhazVar) {
        return eijx.g(new Callable() { // from class: amzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final String str2 = str;
                amwf amwfVar = new amwf() { // from class: amzo
                    @Override // defpackage.amwf
                    public final /* synthetic */ ekgb a() {
                        int i = ekgb.d;
                        return ekoe.a;
                    }

                    @Override // defpackage.amwf, defpackage.amvr
                    public final /* synthetic */ String b() {
                        return "text/plain";
                    }

                    @Override // defpackage.amwf
                    public final String c() {
                        int i = amzw.e;
                        return str2;
                    }
                };
                ajna ajnaVar = ajna.RICH;
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                elny elnyVar = elny.UNKNOWN_BUGLE_MESSAGE_SOURCE;
                long j3 = j;
                long j4 = j2;
                MessageId messageId2 = messageId;
                fhaz fhazVar2 = fhazVar;
                return this.a.c(ajnaVar, (amlm) ajlhVar, amwfVar, ekgbVar, null, null, messageId2, null, null, elnyVar, j3, j4, fhazVar2, null, null);
            }
        }, Build.VERSION.SDK_INT <= 26 ? this.i : this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x091b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0934 A[LOOP:2: B:287:0x092e->B:289:0x0934, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amzg c(defpackage.ajna r33, defpackage.amlm r34, defpackage.amwf r35, defpackage.ekgb r36, defpackage.ajlt r37, com.google.android.apps.messaging.shared.api.messaging.MessageId r38, com.google.android.apps.messaging.shared.api.messaging.MessageId r39, defpackage.anaa r40, defpackage.amie r41, defpackage.elny r42, long r43, long r45, defpackage.fhaz r47, java.util.List r48, defpackage.eyga r49) throws defpackage.ajlf {
        /*
            Method dump skipped, instructions count: 2560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amzw.c(ajna, amlm, amwf, ekgb, ajlt, com.google.android.apps.messaging.shared.api.messaging.MessageId, com.google.android.apps.messaging.shared.api.messaging.MessageId, anaa, amie, elny, long, long, fhaz, java.util.List, eyga):amzg");
    }

    @Override // defpackage.amzy
    public final eiju d(final ajna ajnaVar, final ajlh ajlhVar, final amwf amwfVar, final ekgb ekgbVar, final ajlt ajltVar, final MessageId messageId, final amie amieVar, final elny elnyVar, final long j, final long j2, final fhaz fhazVar, final List list, final eyga eygaVar) {
        eosc eoscVar;
        eksl ekslVar = (eksl) f.h();
        ekslVar.X(cqnc.t, ajlhVar.f());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/envelope/BugleMessagePackager", "prepareContentForSending", 242, "BugleMessagePackager.java")).D("Prepare CONTENT for sending from %s, FeatureSetRequested: %s.", elnyVar.name(), ajnaVar);
        if (ajltVar != null && messageId != null) {
            return eijx.d(new IllegalArgumentException("Message can't be sent as reply and edit."));
        }
        if (Build.VERSION.SDK_INT > 26) {
            eoscVar = this.g;
        } else {
            eoscVar = this.i;
        }
        return eijx.g(new Callable() { // from class: amzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amie amieVar2 = amieVar;
                amzw amzwVar = this.a;
                elny elnyVar2 = elnyVar;
                ajna ajnaVar2 = ajnaVar;
                long j3 = j;
                amlm amlmVar = (amlm) ajlhVar;
                amwf amwfVar2 = amwfVar;
                long j4 = j2;
                ekgb ekgbVar2 = ekgbVar;
                fhaz fhazVar2 = fhazVar;
                return amzwVar.c(ajnaVar2, amlmVar, amwfVar2, ekgbVar2, ajltVar, messageId, null, null, amieVar2, elnyVar2, j3, j4, fhazVar2, list, eygaVar);
            }
        }, eoscVar);
    }
}
