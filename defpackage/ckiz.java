package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ckiz {
    public abstract ckja a();

    public abstract ewlg b();

    public abstract ewrp c();

    public abstract Optional d();

    public abstract String e();

    @Deprecated
    public abstract void f(String str);

    public abstract void g(String str);

    public abstract void h(String str);

    public abstract void i(ewrp ewrpVar);

    public final ckja j() throws MalformedURLException {
        k("rcs_engine_session_id", e());
        final Uri.Builder builderBuildUpon = Uri.parse(((ewlp) b().instance).d).buildUpon();
        Optional optionalD = d();
        builderBuildUpon.getClass();
        optionalD.ifPresent(new Consumer() { // from class: ckix
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                builderBuildUpon.path((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Map.EL.forEach(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ewlp) b().instance).e)), new BiConsumer() { // from class: ckiy
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                Iterator<E> it = ((ewln) obj2).b.iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, (String) it.next());
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        String string = builderBuildUpon.build().toString();
        URL url = new URL(string);
        if (!url.getProtocol().equals("https")) {
            if (!url.getProtocol().equals("http")) {
                dhja.g("Error converting url to secure link when building ProvisioningHttpRequest", new Object[0]);
                throw new MalformedURLException("Only HTTPS or HTTP protocols are allowed in the URL");
            }
            if (!((Boolean) dfbw.e.a()).booleanValue() && !c().equals(ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_STATE)) {
                string = string.replace("http://", "https://");
            }
        }
        f(string);
        return a();
    }

    public final void k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ewlg ewlgVarB = b();
        ewli ewliVar = ewli.a;
        java.util.Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((ewlp) ewlgVarB.instance).f);
        if (mapUnmodifiableMap.containsKey(str)) {
            ewliVar = (ewli) mapUnmodifiableMap.get(str);
        }
        ewlh ewlhVar = (ewlh) ewliVar.toBuilder();
        ewlhVar.copyOnWrite();
        ewli ewliVar2 = (ewli) ewlhVar.instance;
        str2.getClass();
        evtg evtgVar = ewliVar2.b;
        if (!evtgVar.c()) {
            ewliVar2.b = evsn.mutableCopy(evtgVar);
        }
        ewliVar2.b.add(str2);
        ewli ewliVar3 = (ewli) ewlhVar.build();
        ewlg ewlgVarB2 = b();
        ewliVar3.getClass();
        ewlgVarB2.copyOnWrite();
        ((ewlp) ewlgVarB2.instance).a().put(str, ewliVar3);
    }

    public final void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ewlg ewlgVarB = b();
        ewln ewlnVar = ewln.a;
        java.util.Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((ewlp) ewlgVarB.instance).e);
        if (mapUnmodifiableMap.containsKey(str)) {
            ewlnVar = (ewln) mapUnmodifiableMap.get(str);
        }
        ewlm ewlmVar = (ewlm) ewlnVar.toBuilder();
        ewlmVar.a(str2);
        b().a(str, (ewln) ewlmVar.build());
    }

    public final void m(int i) {
        ewlg ewlgVarB = b();
        ewlgVarB.copyOnWrite();
        ewlp ewlpVar = (ewlp) ewlgVarB.instance;
        ewlp ewlpVar2 = ewlp.a;
        ewlpVar.c = i - 1;
        ewlpVar.b |= 1;
    }
}
