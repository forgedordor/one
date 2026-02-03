package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caum extends cayv {
    public static final cqce a = cqce.g("BugleDataModel", "DownloadMmsHandler");
    public final Context b;
    public final cogw c;
    public final fcsu d;
    public final cmqj e;
    public final auuh f;
    public final fcsu g;
    public final axut h;
    private final eosc i;

    public caum(Context context, eosc eoscVar, cogw cogwVar, fcsu fcsuVar, cmqj cmqjVar, axut axutVar, auuh auuhVar, fcsu fcsuVar2) {
        this.b = context;
        this.i = eoscVar;
        this.c = cogwVar;
        this.d = fcsuVar;
        this.e = cmqjVar;
        this.h = axutVar;
        this.f = auuhVar;
        this.g = fcsuVar2;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        ((caxk) caxzVarL).c = elgm.DOWNLOAD_MMS_ACTION;
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DownloadMmsHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cauo.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cauo cauoVar = (cauo) evuhVar;
        return eijx.g(new Callable() { // from class: caul
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cauo cauoVar2;
                cauo cauoVar3 = cauoVar;
                caum caumVar = this.a;
                try {
                    int i = cauoVar3.i;
                    MessageIdType messageIdTypeB = bary.b(cauoVar3.c);
                    Uri uri = Uri.parse(cauoVar3.h);
                    String str = cauoVar3.j;
                    String str2 = cauoVar3.g;
                    String str3 = cauoVar3.f;
                    boolean z = cauoVar3.k;
                    ConversationIdType conversationIdTypeB = barn.b(cauoVar3.d);
                    String str4 = cauoVar3.e;
                    int i2 = cauoVar3.l;
                    int i3 = cauoVar3.m;
                    long j = (cauoVar3.b & 4096) != 0 ? cauoVar3.o : 0L;
                    long jA = axja.a(caumVar.c.f().toEpochMilli());
                    Uri uri2 = TextUtils.isEmpty(str3) ? Uri.EMPTY : Uri.parse(str3);
                    String strB = ejwk.b(MessageData.ay(i3));
                    cqce cqceVar = caum.a;
                    cqbd cqbdVarC = cqceVar.c();
                    cqbdVarC.I("Downloading message.");
                    cqbdVarC.I(strB);
                    cqbdVarC.o(messageIdTypeB, conversationIdTypeB);
                    cqbdVarC.I("autoDownload:");
                    cqbdVarC.J(z);
                    cqbdVarC.v(", contentLocation:");
                    cqbdVarC.l(uri2);
                    cqbdVarC.r();
                    if (MessageData.cx(i3)) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("status_if_failed", i2);
                        bundle.putBoolean("auto_download", z);
                        caumVar.f.c(caumVar.b, cauoVar3.n, bundle);
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("message_id", messageIdTypeB.b());
                        bundle2.putString("conversation_id", conversationIdTypeB.toString());
                        bundle2.putString("participant_id", str4);
                        bundle2.putInt("status_if_failed", i2);
                        bundle2.putLong("message_logging_id", j);
                        ((ajhd) caumVar.d.b()).K(conversationIdTypeB, i, j);
                        cauoVar2 = cauoVar3;
                        try {
                            chvf chvfVarP = caumVar.e.p(caumVar.b, uri, i, str, str2, uri2, z, jA / 1000, bundle2, j);
                            if (chvfVarP == chvf.i) {
                                cqbd cqbdVarA = cqceVar.a();
                                cqbdVarA.I("Downloading MMS message asynchronously, waiting for pending intent.");
                                cqbdVarA.o(messageIdTypeB, conversationIdTypeB);
                                cqbdVarA.r();
                            } else {
                                ((cmqf) caumVar.g.b()).i(jA);
                                axut axutVar = caumVar.h;
                                int i4 = ((chuf) chvfVarP).e;
                                uri.getClass();
                                str4.getClass();
                                uri2.getClass();
                                str.getClass();
                                str2.getClass();
                                new ProcessDownloadedMmsAction(axutVar.d, axutVar.b, messageIdTypeB, uri, conversationIdTypeB, str4, uri2, i, str, i2, z, str2, i4).z();
                            }
                        } catch (Exception unused) {
                            axut axutVar2 = caumVar.h;
                            cauo cauoVar4 = cauoVar2;
                            MessageIdType messageIdTypeB2 = bary.b(cauoVar4.c);
                            ConversationIdType conversationIdTypeB2 = barn.b(cauoVar4.d);
                            String str5 = cauoVar4.e;
                            int i5 = cauoVar4.l;
                            int i6 = cauoVar4.i;
                            String str6 = cauoVar4.g;
                            str5.getClass();
                            str6.getClass();
                            new ProcessDownloadedMmsAction(axutVar2.e, axutVar2.b, messageIdTypeB2, conversationIdTypeB2, str5, i5, i6, str6).z();
                            return cbcw.i();
                        }
                    }
                } catch (Exception unused2) {
                    cauoVar2 = cauoVar3;
                }
                return cbcw.i();
            }
        }, this.i);
    }
}
