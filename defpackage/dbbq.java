package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.android.vcard.VCardConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbq extends ebsk {
    private final Context b;

    public dbbq(Context context) {
        super(new ebsg(dbbp.b));
        this.b = context;
        List<Pair> listB = fcva.b(new Pair("/", new ppo(context)));
        ArrayList<lcb> arrayList = new ArrayList();
        for (Pair pair : listB) {
            arrayList.add(new lcb((String) pair.first, (ppo) pair.second));
        }
        List list = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (lcb lcbVar : arrayList) {
            arrayList2.add(new ppp((String) lcbVar.a, (ppo) lcbVar.b));
        }
        list.add(new ppq(arrayList2));
    }

    @Override // defpackage.ebsf
    public final boolean d(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return true;
    }

    @Override // defpackage.ebsf
    public final boolean fv(WebView webView, WebResourceRequest webResourceRequest) throws IOException {
        webView.getClass();
        webResourceRequest.getClass();
        Intent flags = new Intent().setAction("android.intent.action.VIEW").setData(webResourceRequest.getUrl()).setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        flags.getClass();
        eiid.o(this.b, flags);
        return true;
    }
}
