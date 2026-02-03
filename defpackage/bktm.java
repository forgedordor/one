package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bktm extends dqpd {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public String h;
    public String i;
    private String j;
    private String k;
    private String l;
    private AgentUseCase m = AgentUseCase.AGENT_USE_CASE_UNSPECIFIED;
    private String n;
    private String o;

    protected bktm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RbmBusinessInfoAndVerifierInfoQuery [rbm_business_info.rbm_business_info_rbm_bot_id: %s,\n  rbm_business_info.rbm_business_info_display_name: %s,\n  rbm_business_info.rbm_business_info_logo_image_remote_url: %s,\n  rbm_business_info.rbm_business_info_logo_image_local_uri: %s,\n  rbm_business_info.rbm_business_info_description: %s,\n  rbm_business_info.rbm_business_info_color: %s,\n  rbm_business_info.rbm_business_info_hero_image_remote_url: %s,\n  rbm_business_info.rbm_business_info_hero_image_local_uri: %s,\n  rbm_business_info.rbm_business_info_version: %s,\n  rbm_business_info.rbm_business_info_expiry_milliseconds: %s,\n  rbm_business_info.rbm_business_info_agent_use_case_category: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_id: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_name: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_logo_image_remote_url: %s,\n  rbm_business_verifier_info.rbm_business_verifier_info_verifier_logo_image_local_uri: %s\n]\n", String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.l), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.m), String.valueOf(this.h), String.valueOf(this.n), String.valueOf(this.i), String.valueOf(this.o));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bkuz.c().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bkuu bkuuVar = (bkuu) dqqjVar;
        aC();
        this.cN = bkuuVar.cV();
        if (bkuuVar.dj(0)) {
            this.j = bkuuVar.getString(bkuuVar.cO(0, bkuz.a));
            fN(0);
        }
        if (bkuuVar.dj(1)) {
            this.k = bkuuVar.getString(bkuuVar.cO(1, bkuz.a));
            fN(1);
        }
        if (bkuuVar.dj(2)) {
            this.a = bkuuVar.getString(bkuuVar.cO(2, bkuz.a));
            fN(2);
        }
        if (bkuuVar.dj(3)) {
            this.b = bkuuVar.getString(bkuuVar.cO(3, bkuz.a));
            fN(3);
        }
        if (bkuuVar.dj(4)) {
            this.l = bkuuVar.getString(bkuuVar.cO(4, bkuz.a));
            fN(4);
        }
        if (bkuuVar.dj(5)) {
            this.c = bkuuVar.getString(bkuuVar.cO(5, bkuz.a));
            fN(5);
        }
        if (bkuuVar.dj(6)) {
            this.d = bkuuVar.getString(bkuuVar.cO(6, bkuz.a));
            fN(6);
        }
        if (bkuuVar.dj(7)) {
            this.e = bkuuVar.getString(bkuuVar.cO(7, bkuz.a));
            fN(7);
        }
        if (bkuuVar.dj(8)) {
            this.f = bkuuVar.getString(bkuuVar.cO(8, bkuz.a));
            fN(8);
        }
        if (bkuuVar.dj(9)) {
            this.g = bkuuVar.getLong(bkuuVar.cO(9, bkuz.a));
            fN(9);
        }
        if (bkuuVar.dj(10)) {
            AgentUseCase[] agentUseCaseArrValues = AgentUseCase.values();
            int i = bkuuVar.getInt(bkuuVar.cO(10, bkuz.a));
            if (i >= agentUseCaseArrValues.length) {
                throw new IllegalArgumentException();
            }
            this.m = agentUseCaseArrValues[i];
            fN(10);
        }
        if (bkuuVar.dj(11)) {
            this.h = bkuuVar.getString(bkuuVar.cO(11, bkuz.a));
            fN(11);
        }
        if (bkuuVar.dj(12)) {
            this.n = bkuuVar.getString(bkuuVar.cO(12, bkuz.a));
            fN(12);
        }
        if (bkuuVar.dj(13)) {
            this.i = bkuuVar.getString(bkuuVar.cO(13, bkuz.a));
            fN(13);
        }
        if (bkuuVar.dj(14)) {
            this.o = bkuuVar.getString(bkuuVar.cO(14, bkuz.a));
            fN(14);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bktm)) {
            return false;
        }
        bktm bktmVar = (bktm) obj;
        return super.aE(bktmVar.cN) && Objects.equals(this.j, bktmVar.j) && Objects.equals(this.k, bktmVar.k) && Objects.equals(this.a, bktmVar.a) && Objects.equals(this.b, bktmVar.b) && Objects.equals(this.l, bktmVar.l) && Objects.equals(this.c, bktmVar.c) && Objects.equals(this.d, bktmVar.d) && Objects.equals(this.e, bktmVar.e) && Objects.equals(this.f, bktmVar.f) && this.g == bktmVar.g && this.m == bktmVar.m && Objects.equals(this.h, bktmVar.h) && Objects.equals(this.n, bktmVar.n) && Objects.equals(this.i, bktmVar.i) && Objects.equals(this.o, bktmVar.o);
    }

    public final AgentUseCase f() {
        aA(10, "agent_use_case_category");
        return this.m;
    }

    public final String g() {
        aA(4, "description");
        return this.l;
    }

    public final String h() {
        aA(1, "display_name");
        return this.k;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        String str = this.j;
        String str2 = this.k;
        String str3 = this.a;
        String str4 = this.b;
        String str5 = this.l;
        String str6 = this.c;
        String str7 = this.d;
        String str8 = this.e;
        String str9 = this.f;
        Long lValueOf = Long.valueOf(this.g);
        AgentUseCase agentUseCase = this.m;
        return Objects.hash(dqqeVar2, str, str2, str3, str4, str5, str6, str7, str8, str9, lValueOf, Integer.valueOf(agentUseCase == null ? 0 : agentUseCase.ordinal()), this.h, this.n, this.i, this.o, null);
    }

    public final String i() {
        aA(0, "rbm_bot_id");
        return this.j;
    }

    public final String j() {
        aA(14, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
        return this.o;
    }

    public final String k() {
        aA(12, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_NAME);
        return this.n;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RbmBusinessInfoAndVerifierInfoQuery -- REDACTED") : a();
    }
}
