package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covx {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final fcsu b;
    public final eosc c;
    public final fcsu d;
    private final eosc e;

    public covx(fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = eoscVar;
        this.e = eoscVar2;
        this.d = fcsuVar2;
    }

    public static coux a(basd basdVar, aubq aubqVar, cous cousVar, String str) {
        final ejvj ejvjVarFH = new atal().fH();
        final coux couxVar = (coux) couy.a.createBuilder();
        String strE = basd.e(basdVar);
        couxVar.copyOnWrite();
        couy couyVar = (couy) couxVar.instance;
        couyVar.b |= 1;
        couyVar.c = strE;
        couxVar.copyOnWrite();
        couy couyVar2 = (couy) couxVar.instance;
        aubqVar.getClass();
        couyVar2.l = aubqVar;
        couyVar2.b |= 512;
        coud coudVar = (coud) cousVar;
        String string = coudVar.c.toString();
        couxVar.copyOnWrite();
        couy couyVar3 = (couy) couxVar.instance;
        string.getClass();
        couyVar3.b |= 2;
        couyVar3.d = string;
        couxVar.copyOnWrite();
        couy couyVar4 = (couy) couxVar.instance;
        str.getClass();
        couyVar4.b |= 16;
        couyVar4.g = str;
        coudVar.d.ifPresent(new Consumer() { // from class: covo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                coux couxVar2 = couxVar;
                String str2 = (String) obj;
                couxVar2.copyOnWrite();
                couy couyVar5 = (couy) couxVar2.instance;
                couy couyVar6 = couy.a;
                str2.getClass();
                couyVar5.b |= 4;
                couyVar5.e = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        coudVar.b.ifPresent(new Consumer() { // from class: covp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = covx.a;
                aubx aubxVar = (aubx) ejvjVarFH.fM((ContentType) obj);
                coux couxVar2 = couxVar;
                couxVar2.copyOnWrite();
                couy couyVar5 = (couy) couxVar2.instance;
                couy couyVar6 = couy.a;
                aubxVar.getClass();
                couyVar5.i = aubxVar;
                couyVar5.b |= 64;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return couxVar;
    }

    public final eiju b(final String str, couy couyVar) {
        caxr caxrVar = new caxr();
        caxrVar.d = str;
        caxrVar.b = str;
        eiju eijuVarB = ((cazj) ((cowj) this.b.b()).a.b()).a(cbcu.g("messaging_file_upload", couyVar, caxrVar.a())).b();
        ejvr ejvrVar = new ejvr() { // from class: covv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = covx.a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str2 = str;
                if (zBooleanValue) {
                    eksl ekslVar = (eksl) covx.a.h();
                    ekslVar.X(coie.a, str2);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 155, "FileUploadWorkScheduler.java")).q("File upload is queued.");
                    return chvf.i;
                }
                eksl ekslVar2 = (eksl) covx.a.j();
                ekslVar2.X(coie.a, str2);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 158, "FileUploadWorkScheduler.java")).q("Failed to queue file upload.");
                return chvf.j(3, 0).a();
            }
        };
        eosc eoscVar = this.e;
        return eijuVarB.h(ejvrVar, eoscVar).e(CancellationException.class, new ejvr() { // from class: covw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar = (eksl) covx.a.h();
                ekslVar.X(coie.a, str);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 170, "FileUploadWorkScheduler.java")).q("Not queuing file upload as it is already scheduled.");
                return chvf.i;
            }
        }, eoscVar);
    }

    public final eiju c(final String str, final MessageCoreData messageCoreData, final cous cousVar) {
        return eijx.h(new eooy() { // from class: covu
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                MessageCoreData messageCoreData2 = messageCoreData;
                basd basdVarF = messageCoreData2.F();
                aubq aubqVarW = messageCoreData2.w();
                cous cousVar2 = cousVar;
                String str2 = str;
                final coux couxVarA = covx.a(basdVarF, aubqVarW, cousVar2, str2);
                coud coudVar = (coud) cousVar2;
                coudVar.g.ifPresent(new Consumer() { // from class: covq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        coux couxVar = couxVarA;
                        evqs evqsVar = (evqs) obj;
                        couxVar.copyOnWrite();
                        couy couyVar = (couy) couxVar.instance;
                        couy couyVar2 = couy.a;
                        evqsVar.getClass();
                        couyVar.b |= 8;
                        couyVar.f = evqsVar;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                coudVar.f.ifPresent(new Consumer() { // from class: covr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        eksp ekspVar = covx.a;
                        aubx aubxVar = (aubx) new atal().fH().fM((ContentType) obj);
                        coux couxVar = couxVarA;
                        couxVar.copyOnWrite();
                        couy couyVar = (couy) couxVar.instance;
                        couy couyVar2 = couy.a;
                        aubxVar.getClass();
                        couyVar.j = aubxVar;
                        couyVar.b |= 128;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return this.a.b(str2, (couy) couxVarA.build());
            }
        }, this.c);
    }
}
