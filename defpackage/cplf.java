package defpackage;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cplf {
    public static final Charset a = Charset.forName("UTF-8");
    public final femd b;
    public final femm c;
    public final ferh d;
    public List e;
    protected fems f;
    protected femz g;
    protected femz h;
    protected feou i;

    public cplf(femd femdVar, ferb ferbVar, feoq feoqVar, ferh ferhVar) {
        this.b = femdVar;
        this.d = ferhVar;
        this.c = new cple(this, fena.a, ferbVar, feoqVar);
    }

    public static void a(feou feouVar) {
        if (feouVar == null) {
            throw new femy("Expected property not initialised");
        }
    }

    public final void b() {
        ferg fergVarA;
        for (feou feouVar : this.e) {
            feno fenoVarB = feouVar.b("TZID");
            if (fenoVarB != null && (fergVarA = this.d.a(fenoVarB.a())) != null) {
                String strA = feouVar.a();
                if (feouVar instanceof feuq) {
                    ((feuq) feouVar).e(fergVarA);
                } else if (feouVar instanceof feup) {
                    ((feup) feouVar).d(fergVarA);
                }
                try {
                    feouVar.c(strA);
                } catch (URISyntaxException | ParseException e) {
                    throw new femy(e);
                }
            }
        }
    }
}
