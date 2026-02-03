package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bswk extends dqpd implements dqpf {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public AgentUseCase l = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;

    protected bswk() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoTable [rbm_bot_id: %s,\n  display_name: %s,\n  logo_image_remote_url: %s,\n  logo_image_local_uri: %s,\n  description: %s,\n  color: %s,\n  hero_image_remote_url: %s,\n  hero_image_local_uri: %s,\n  verifier_id: %s,\n  version: %s,\n  expiry_milliseconds: %s,\n  agent_use_case_category: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = bsyn.d().intValue();
        dqru.v(contentValues, "rbm_bot_id", this.a);
        dqru.v(contentValues, "display_name", this.b);
        dqru.v(contentValues, "logo_image_remote_url", this.c);
        dqru.v(contentValues, "logo_image_local_uri", this.d);
        dqru.v(contentValues, "description", this.e);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, this.f);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, this.g);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, this.h);
        dqru.v(contentValues, "verifier_id", this.i);
        dqru.v(contentValues, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, this.j);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, Long.valueOf(this.k));
        if (iIntValue >= 59140) {
            AgentUseCase agentUseCase = this.l;
            if (agentUseCase == null) {
                contentValues.putNull("agent_use_case_category");
            } else {
                contentValues.put("agent_use_case_category", Integer.valueOf(agentUseCase.ordinal()));
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bsyb bsybVar = (bsyb) ((bsxo) dqqjVar);
        aC();
        this.cN = bsybVar.cV();
        if (bsybVar.dj(0)) {
            this.a = bsybVar.m();
            fN(0);
        }
        if (bsybVar.dj(1)) {
            this.b = bsybVar.h();
            fN(1);
        }
        if (bsybVar.dj(2)) {
            this.c = bsybVar.l();
            fN(2);
        }
        if (bsybVar.dj(3)) {
            this.d = bsybVar.k();
            fN(3);
        }
        if (bsybVar.dj(4)) {
            this.e = bsybVar.g();
            fN(4);
        }
        if (bsybVar.dj(5)) {
            this.f = bsybVar.f();
            fN(5);
        }
        if (bsybVar.dj(6)) {
            this.g = bsybVar.j();
            fN(6);
        }
        if (bsybVar.dj(7)) {
            this.h = bsybVar.i();
            fN(7);
        }
        if (bsybVar.dj(8)) {
            this.i = bsybVar.n();
            fN(8);
        }
        if (bsybVar.dj(9)) {
            this.j = bsybVar.o();
            fN(9);
        }
        if (bsybVar.dj(10)) {
            this.k = bsybVar.c();
            fN(10);
        }
        if (bsybVar.dj(11)) {
            this.l = bsybVar.e();
            fN(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bswk)) {
            return false;
        }
        bswk bswkVar = (bswk) obj;
        return super.aE(bswkVar.cN) && Objects.equals(this.a, bswkVar.a) && Objects.equals(this.b, bswkVar.b) && Objects.equals(this.c, bswkVar.c) && Objects.equals(this.d, bswkVar.d) && Objects.equals(this.e, bswkVar.e) && Objects.equals(this.f, bswkVar.f) && Objects.equals(this.g, bswkVar.g) && Objects.equals(this.h, bswkVar.h) && Objects.equals(this.i, bswkVar.i) && Objects.equals(this.j, bswkVar.j) && this.k == bswkVar.k && this.l == bswkVar.l;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "rbm_business_info", dqru.m(new String[]{"rbm_bot_id", "display_name", "logo_image_remote_url", "logo_image_local_uri", "description", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI, "verifier_id", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS, "agent_use_case_category"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "rbm_business_info";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        String str9 = this.i;
        String str10 = this.j;
        Long lValueOf = Long.valueOf(this.k);
        AgentUseCase agentUseCase = this.l;
        return Objects.hash(dqqeVar2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, lValueOf, Integer.valueOf(agentUseCase == null ? 0 : agentUseCase.ordinal()), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String str8 = this.h;
        String str9 = this.i;
        String str10 = this.j;
        Long lValueOf = Long.valueOf(this.k);
        AgentUseCase agentUseCase = this.l;
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, str9, str10, lValueOf, agentUseCase == null ? 0 : String.valueOf(agentUseCase.ordinal())};
        sb.append('(');
        for (int i = 0; i < 12; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str11 = (String) obj;
                    if (str11.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str11));
                    }
                }
                list.add(obj);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(10, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
        return this.k;
    }

    public final String m() {
        aA(5, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR);
        return this.f;
    }

    public final String n() {
        aA(1, "display_name");
        return this.b;
    }

    public final String o() {
        aA(0, "rbm_bot_id");
        return this.a;
    }

    public final String p() {
        aA(8, "verifier_id");
        return this.i;
    }

    public final String q() {
        aA(9, BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
        return this.j;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RbmBusinessInfoTable -- REDACTED") : a();
    }
}
