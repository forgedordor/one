package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.system.ErrnoException;
import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftm extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;

    public dftm(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4) {
        super(eyikVar2, new eyji(dftm.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) throws IOException, ErrnoException {
        long length;
        List list = (List) obj;
        efft efftVar = (efft) list.get(0);
        dfuv dfuvVar = (dfuv) list.get(1);
        dfvy dfvyVar = (dfvy) list.get(2);
        dfrn dfrnVar = (dfrn) list.get(3);
        efiw efiwVarA = efftVar.a();
        Conversation conversationB = efftVar.b();
        dhja.d(dftl.a, "Sending SLM file message [%s] in new SLM session [%s]", efiwVarA.f(), conversationB);
        String strF = dfwf.f(efiwVarA.b());
        String strF2 = efiwVarA.d().isPresent() ? dfwf.f((RcsDestinationId) efiwVarA.d().get()) : "sip:anonymous@anonymous.invalid";
        String str = (String) dfuv.f.get("urn:ietf:params:imdn");
        str.getClass();
        efgv efgvVarF = efgw.f();
        efgvVarF.g(str, "urn:ietf:params:imdn");
        efgvVarF.e("From", new ebcq(strF).toString());
        efgvVarF.e("To", new ebcq(strF2).toString());
        diep diepVar = dfuvVar.h;
        efgvVarF.e("DateTime", diepVar.f().toString());
        efgvVarF.f("urn:ietf:params:imdn", "Message-ID", efiwVarA.f());
        ebcm ebcmVar = dfuvVar.j;
        Uri uriA = efiwVarA.a().a();
        String scheme = uriA.getScheme();
        ejwl.b(scheme == null ? false : TextUtils.equals(scheme.trim().toLowerCase(Locale.US), "content"), "expected uri to be a Content Uri");
        Context context = ebcmVar.b;
        AssetFileDescriptor assetFileDescriptorA = ebsv.a(context, uriA, "r", ebcn.e(uriA));
        if (assetFileDescriptorA == null) {
            dhja.r(ebcm.a, "Failed to open AFD for length of contentUri: %s", dhiz.URI.c(uriA.toString()));
            length = 0;
        } else {
            length = assetFileDescriptorA.getLength();
            assetFileDescriptorA.close();
        }
        ebck ebckVar = new ebck(context, uriA, length);
        efgy efgyVarD = efgz.d();
        efgyVarD.d(ebckVar);
        efgyVarD.f(ffho.a, efiwVarA.a().b().toString());
        efgyVarD.f(ffho.c, "attachment");
        efgyVarD.f("Content-Length", String.valueOf(ebckVar.a));
        ((efgm) efgvVarF).a = efgyVarD.e();
        efgw efgwVarA = efgvVarF.a();
        String strF3 = dfwf.f((RcsDestinationId) (efiwVarA.d().isPresent() ? efiwVarA.d().get() : conversationB.a()));
        String strF4 = dfwf.f(efiwVarA.b());
        dgyx dgyxVar = new dgyx(dgyw.CPIM_MESSAGE, 2);
        dgyxVar.f(dfuv.e.toString(), efgwVarA);
        dgyxVar.b = strF3;
        dgyxVar.c = strF4;
        dgyxVar.k = efiwVarA.f();
        dgyxVar.j = diepVar.f().toEpochMilli();
        dgyxVar.r = false;
        return dfrnVar.a(conversationB, dgyxVar, dfvyVar.createOutgoingSlmSession(dfwf.f(conversationB.a()))).d(dgyxVar);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.e;
        eyir eyirVar2 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar2.d(), eyirVar.d());
    }
}
