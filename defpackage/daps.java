package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.gms.wearable.ChannelClient;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daps implements bxgq {
    final /* synthetic */ babw a;
    final /* synthetic */ ChannelClient.Channel b;
    final /* synthetic */ Uri c;
    final /* synthetic */ WearableBindService d;

    public daps(WearableBindService wearableBindService, babw babwVar, ChannelClient.Channel channel, Uri uri) {
        this.a = babwVar;
        this.b = channel;
        this.c = uri;
        this.d = wearableBindService;
    }

    @Override // defpackage.bxgq
    public final void fU(bxgk bxgkVar) {
        eksl ekslVar = (eksl) WearableBindService.a.j();
        ekslVar.X(cqnc.S, "WearableBindService");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/WearableBindService$1", "onMediaResourceLoadError", 698, "WearableBindService.java")).t("onChannelOpened couldn't load media part: %s", this.c);
        babw babwVar = this.a;
        if (babwVar.g()) {
            babwVar.f();
            WearableBindService wearableBindService = this.d;
            wearableBindService.b.remove(this.b);
        }
    }

    @Override // defpackage.bxgq
    public final /* bridge */ /* synthetic */ void fV(bxgk bxgkVar, bxgz bxgzVar, boolean z) {
        final bxgh bxghVar = (bxgh) bxgzVar;
        eksl ekslVar = (eksl) WearableBindService.a.h();
        ekslVar.X(cqnc.S, "WearableBindService");
        eksl ekslVar2 = (eksl) ekslVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 745, "WearableBindService.java");
        final babw babwVar = this.a;
        final ChannelClient.Channel channel = this.b;
        ekslVar2.E("#sendMediaViaChannelAsync path: %s, isBound: %s", channel.a(), babwVar.g());
        if (babwVar.g()) {
            final WearableBindService wearableBindService = this.d;
            wearableBindService.f(channel).k(auvh.c(new Consumer() { // from class: daph
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) throws IOException {
                    ekrw ekrwVarJ;
                    WearableBindService wearableBindService2 = wearableBindService;
                    babw babwVar2 = babwVar;
                    ChannelClient.Channel channel2 = channel;
                    bxgh bxghVar2 = bxghVar;
                    OutputStream outputStream = (OutputStream) obj;
                    try {
                        try {
                            try {
                                if (babwVar2.g()) {
                                    byte[] bArrJ = bxghVar2.j();
                                    if (bArrJ != null) {
                                        outputStream.write(bArrJ, 0, bArrJ.length);
                                    } else {
                                        eksl ekslVar3 = (eksl) WearableBindService.a.j();
                                        ekslVar3.X(cqnc.S, "WearableBindService");
                                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 771, "WearableBindService.java")).q("sendMediaViaChannelAsync: ImageResource returned null bytes.");
                                    }
                                    outputStream.close();
                                    babwVar2.f();
                                    wearableBindService2.b.remove(channel2);
                                    return;
                                }
                                eksl ekslVar4 = (eksl) WearableBindService.a.j();
                                ekslVar4.X(cqnc.S, "WearableBindService");
                                ((eksl) ekslVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 758, "WearableBindService.java")).t("sendMediaViaChannelAsync channel callback: obsolete request obsolete request is no longer bound, path: %s", channel2.a());
                                try {
                                    outputStream.close();
                                    babwVar2.f();
                                    wearableBindService2.b.remove(channel2);
                                } catch (Exception e) {
                                    e = e;
                                    ekrwVarJ = WearableBindService.a.j();
                                    eksl ekslVar5 = (eksl) ekrwVarJ;
                                    ekslVar5.X(cqnc.S, "WearableBindService");
                                    ((eksl) ((eksl) ekslVar5.g(e)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 797, "WearableBindService.java")).q("sendMediaViaChannelAsync: Failed to close channel.");
                                }
                            } catch (Exception e2) {
                                e = e2;
                                ekrwVarJ = WearableBindService.a.j();
                            }
                        } catch (bxgg e3) {
                            eksl ekslVar6 = (eksl) WearableBindService.a.j();
                            ekslVar6.X(cqnc.S, "WearableBindService");
                            ((eksl) ((eksl) ekslVar6.g(e3)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 784, "WearableBindService.java")).q("sendMediaViaChannelAsync: Could not get bytes from image type to write to channel.");
                            outputStream.close();
                            babwVar2.f();
                            wearableBindService2.b.remove(channel2);
                        } catch (IOException e4) {
                            eksl ekslVar7 = (eksl) WearableBindService.a.j();
                            ekslVar7.X(cqnc.S, "WearableBindService");
                            ((eksl) ((eksl) ekslVar7.g(e4)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 778, "WearableBindService.java")).q("sendMediaViaChannelAsync: Channel failed to write.");
                            outputStream.close();
                            babwVar2.f();
                            wearableBindService2.b.remove(channel2);
                        }
                    } catch (Throwable th) {
                        try {
                            outputStream.close();
                            babwVar2.f();
                            wearableBindService2.b.remove(channel2);
                        } catch (Exception e5) {
                            eksl ekslVar8 = (eksl) WearableBindService.a.j();
                            ekslVar8.X(cqnc.S, "WearableBindService");
                            ((eksl) ((eksl) ekslVar8.g(e5)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 797, "WearableBindService.java")).q("sendMediaViaChannelAsync: Failed to close channel.");
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), (Executor) wearableBindService.v.b());
        }
    }
}
