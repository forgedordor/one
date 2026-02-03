package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cive {
    public static final cqce a = cqce.g("BugleDataModel", "IncomingRbmMessageHandler");
    public final fcsu b;
    public final cmpg c;
    public final chxo d;
    public final ejxr e;
    public final aqoc f;
    public boolean g;
    public ParticipantsTable.BindData h;
    public boolean i;
    public RichCardContainer j;
    public BusinessInfoData k;
    private final fcsu l;

    public cive(fcsu fcsuVar, fcsu fcsuVar2, cmpg cmpgVar, final alrj alrjVar, aqoc aqocVar, final chxo chxoVar) {
        this.b = fcsuVar;
        this.l = fcsuVar2;
        this.c = cmpgVar;
        this.d = chxoVar;
        this.f = aqocVar;
        this.e = ejxx.a(new ejxr() { // from class: civd
            @Override // defpackage.ejxr
            public final Object get() {
                return alrjVar.b(chxoVar.g());
            }
        });
    }

    private final ParticipantsTable.BindData g(alqm alqmVar, String str, String str2) {
        String str3 = (String) Optional.ofNullable(alqmVar.h()).orElse(this.d.g().d);
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("No existing bot participant. Creating one.");
        cqbdVarC.M("id", str3);
        cqbdVarC.M("name", str);
        cqbdVarC.A(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, str2);
        cqbdVarC.r();
        return bbbd.a(str3, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ParticipantsTable.BindData a() {
        Optional optionalEmpty;
        eyga eygaVarO = this.d.o();
        if (eygaVarO == null) {
            optionalEmpty = Optional.empty();
        } else {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Trying to get Agent Name from custom CPIM header");
            cqbdVarC.r();
            eyge eygeVar = eyge.a;
            evub evubVar = eygaVarO.b;
            if (evubVar.containsKey("urn:rcs:google:")) {
                eygeVar = (eyge) evubVar.get("urn:rcs:google:");
            }
            evub evubVar2 = eygeVar.b;
            String str = evubVar2.containsKey("Agent-Name") ? (String) evubVar2.get("Agent-Name") : "";
            optionalEmpty = TextUtils.isEmpty(str) ? Optional.empty() : Optional.of(str);
        }
        if (this.k == null && optionalEmpty.isPresent()) {
            cqbd cqbdVarC2 = a.c();
            cqbdVarC2.I("Business Info missing, using Agent Name from custom CPIM Header");
            cqbdVarC2.A("Agent Name", optionalEmpty.get());
            cqbdVarC2.r();
            return g((alqm) this.e.get(), (String) optionalEmpty.get(), bajp.a());
        }
        alqm alqmVar = (alqm) this.e.get();
        BusinessInfoData businessInfoData = this.k;
        if (businessInfoData != null) {
            return g(alqmVar, businessInfoData.getName(), businessInfoData.getColor());
        }
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("No business info available for incoming RCS message for bot.");
        cqbdVarA.M("senderId", alqmVar.h());
        cqbdVarA.r();
        return g(alqmVar, null, null);
    }

    final ParticipantsTable.BindData b() {
        ejwl.b(this.g, "Did you forget to call validateMessageAndInit()?");
        if (!this.f.a()) {
            if (this.h == null) {
                this.h = a();
            }
            return this.h;
        }
        ejwl.b(this.i, "Attempting to get a bot sender for a non-bot message.");
        ParticipantsTable.BindData bindData = this.h;
        bindData.getClass();
        return bindData.C().a();
    }

    final void c() {
        ParticipantsTable.BindData bindData;
        ejwl.b(this.g, "Did you forget to call validateMessageAndInit()?");
        BusinessInfoData businessInfoData = this.k;
        String logoImageLocalUri = businessInfoData == null ? null : businessInfoData.getLogoImageLocalUri();
        if (TextUtils.isEmpty(logoImageLocalUri) || (bindData = this.h) == null || bindData.R() == null) {
            return;
        }
        String strR = this.h.R();
        if (((bbca) this.b.b()).s(strR, Uri.parse(logoImageLocalUri))) {
            ((bakt) this.l.b()).R(strR);
        }
    }

    final boolean d() {
        ejwl.b(this.g, "Did you forget to call validateMessageAndInit()?");
        return this.j != null;
    }

    final boolean e() {
        ejwl.b(this.g, "Did you forget to call validateMessageAndInit()?");
        return this.i;
    }

    final boolean f() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.d.p());
    }
}
