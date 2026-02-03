package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eajj {
    private final qzr a;
    private final eams b;

    public eajj(qzr qzrVar, eams eamsVar) {
        this.a = qzrVar;
        this.b = eamsVar;
    }

    static /* synthetic */ void c(defr defrVar, qzx qzxVar) {
        try {
            defrVar.c(eajd.b(qzxVar));
        } catch (Error | RuntimeException e) {
            eawq.b(e);
            throw e;
        }
    }

    public final defn a(eajp eajpVar, final Class cls) {
        String strB = eajpVar.b();
        Map mapC = eajpVar.c();
        deem deemVarA = eajpVar.a();
        final defr defrVar = deemVarA != null ? new defr(deemVarA) : new defr();
        final eaji eajiVar = new eaji(strB, new qzt() { // from class: eajf
            @Override // defpackage.qzt
            public final void a(Object obj) throws eajr {
                this.a.b(cls, defrVar, (JSONObject) obj);
            }
        }, new qzs() { // from class: eajg
            @Override // defpackage.qzs
            public final void a(qzx qzxVar) {
                eajj.c(defrVar, qzxVar);
            }
        }, mapC);
        if (deemVarA != null) {
            deemVarA.a(new defk() { // from class: eajh
                @Override // defpackage.defk
                public final void a() {
                    eajiVar.e();
                }
            });
        }
        this.a.a(eajiVar);
        return defrVar.a;
    }

    public final /* synthetic */ void b(Class cls, defr defrVar, JSONObject jSONObject) throws eajr {
        try {
            try {
                eams eamsVar = this.b;
                try {
                    defrVar.d((eajq) eamsVar.a.i(jSONObject.toString(), cls));
                } catch (esyr unused) {
                    throw new eajr(a.R(cls, "Could not convert JSON string to ", " due to syntax errors."));
                }
            } catch (eajr e) {
                defrVar.c(new dcff(new Status(8, e.getMessage())));
            }
        } catch (Error | RuntimeException e2) {
            eawq.b(e2);
            throw e2;
        }
    }
}
