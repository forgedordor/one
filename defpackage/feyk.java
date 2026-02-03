package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyk {
    public final fezn a;
    public final fexq b;
    public final List c;
    private final fctc d;

    public feyk(fezn feznVar, fexq fexqVar, List list, final fdae fdaeVar) {
        feznVar.getClass();
        this.a = feznVar;
        this.b = fexqVar;
        this.c = list;
        this.d = fctd.a(new fdae() { // from class: feyh
            @Override // defpackage.fdae
            public final Object invoke() {
                return feyk.b(fdaeVar);
            }
        });
    }

    public static final List b(fdae fdaeVar) {
        try {
            return (List) fdaeVar.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return fcvo.a;
        }
    }

    private static final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof feyk)) {
            return false;
        }
        feyk feykVar = (feyk) obj;
        return feykVar.a == this.a && fdbq.f(feykVar.b, this.b) && fdbq.f(feykVar.a(), a()) && fdbq.f(feykVar.c, this.c);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        List listA = a();
        ArrayList arrayList = new ArrayList(fcva.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        fezn feznVar = this.a;
        fexq fexqVar = this.b;
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + feznVar + " cipherSuite=" + fexqVar + " peerCertificates=" + string + " localCertificates=" + arrayList2 + "}";
    }
}
