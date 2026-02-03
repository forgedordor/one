package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghl extends ceoa {
    public final Executor a;
    private final aghv b;
    private final cenj c;
    private final Context d;
    private final fcsu e;

    public aghl(Context context, Executor executor, cenj cenjVar, aghv aghvVar, fcsu fcsuVar) {
        this.d = context;
        this.a = executor;
        this.c = cenjVar;
        this.b = aghvVar;
        this.e = fcsuVar;
    }

    public final eiju a(final Uri uri, final String str, final String str2, final String str3, final Optional optional) {
        return eiju.g(kol.a(new koi() { // from class: aghk
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                String str4 = str;
                aghl aghlVar = this.a;
                String str5 = str2;
                Uri uri2 = uri;
                Optional optionalC = aghlVar.c(uri2, kogVar, str4, str5, optional);
                if (optionalC.isEmpty()) {
                    kogVar.d();
                    return "Attachment.Download.canceled";
                }
                String str6 = str3;
                ((UrlRequest) optionalC.get()).start();
                cqca.i("BugleNetwork", "starting download of blob " + str6 + " to " + String.valueOf(uri2));
                return "Attachment.Download.start";
            }
        }));
    }

    @Override // defpackage.ceoa
    public final ListenableFuture b(ezns eznsVar, Optional optional, final String str, String str2) {
        final Uri uriD = bxlf.d(str2, this.d);
        ezsf ezsfVar = (ezsf) ezsg.a.createBuilder();
        ezoo ezooVar = (ezoo) ezop.a.createBuilder();
        ezooVar.copyOnWrite();
        ((ezop) ezooVar.instance).c = 1;
        ezooVar.copyOnWrite();
        ezop ezopVar = (ezop) ezooVar.instance;
        str.getClass();
        ezopVar.b = str;
        ezsfVar.copyOnWrite();
        ezsg ezsgVar = (ezsg) ezsfVar.instance;
        ezop ezopVar2 = (ezop) ezooVar.build();
        ezopVar2.getClass();
        ezsgVar.d = ezopVar2;
        ezsgVar.b |= 2;
        cczi ccziVar = cdip.a;
        ezpo ezpoVarA = this.c.a((((Boolean) ccziVar.e()).booleanValue() && optional.isPresent()) ? "GDitto" : "Bugle");
        evqs evqsVar = eznsVar.b;
        ezpoVarA.copyOnWrite();
        ezpp ezppVar = (ezpp) ezpoVarA.instance;
        ezpp ezppVar2 = ezpp.a;
        evqsVar.getClass();
        ezppVar.f = evqsVar;
        ezsfVar.copyOnWrite();
        ezsg ezsgVar2 = (ezsg) ezsfVar.instance;
        ezpp ezppVar3 = (ezpp) ezpoVarA.build();
        ezppVar3.getClass();
        ezsgVar2.c = ezppVar3;
        ezsgVar2.b |= 1;
        final String strEncodeToString = Base64.encodeToString(((ezsg) ezsfVar.build()).toByteArray(), 2);
        final String str3 = (String) cefs.a.e();
        return ((Boolean) ccziVar.e()).booleanValue() ? optional.isPresent() ? eiju.g(((aghy) this.e.b()).a((efwo) optional.get())).i(new eooz() { // from class: aghi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.a(uriD, str3, strEncodeToString, str, Optional.of((aghw) obj));
            }
        }, this.a) : a(uriD, str3, strEncodeToString, str, Optional.empty()) : kol.a(new koi() { // from class: aghj
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                String str4 = str3;
                aghl aghlVar = this.a;
                String str5 = strEncodeToString;
                Uri uri = uriD;
                Optional optionalC = aghlVar.c(uri, kogVar, str4, str5, Optional.empty());
                if (optionalC.isEmpty()) {
                    kogVar.d();
                    return "Attachment.Download.canceled";
                }
                String str6 = str;
                ((UrlRequest) optionalC.get()).start();
                cqca.i("BugleNetwork", "starting download of blob " + str6 + " to " + String.valueOf(uri));
                return "Attachment.Download.start";
            }
        });
    }

    public final Optional c(Uri uri, kog kogVar, final String str, final String str2, final Optional optional) {
        final aghg aghgVar = new aghg(uri, kogVar, this.d);
        return this.b.a().map(new Function() { // from class: aghh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                UrlRequest.Builder trafficStatsTag = ((CronetEngine) obj).newUrlRequestBuilder(str, aghgVar, this.a.a).setPriority(2).addHeader("X-Goog-Download-Metadata", str2).setTrafficStatsTag(8195);
                Optional optional2 = optional;
                if (optional2.isPresent()) {
                    trafficStatsTag.addHeader(((aghw) optional2.get()).a, ((aghw) optional2.get()).b);
                }
                return trafficStatsTag.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
