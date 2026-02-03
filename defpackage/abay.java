package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abay extends abai {
    private final Context g;
    private final crny h;
    private final cqbm i;
    private final crmx j;
    private final bbdl k;

    public abay(abag abagVar, Context context, crny crnyVar, cqbm cqbmVar, crmx crmxVar, bbdl bbdlVar) {
        super(abagVar, "SMS/MMS Connectivity Check");
        this.g = context;
        this.h = crnyVar;
        this.i = cqbmVar;
        this.j = crmxVar;
        this.k = bbdlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [alqm, java.lang.Object] */
    @Override // defpackage.abai
    public final abaj a() {
        String string;
        abaf abafVar = this.a;
        abafVar.b("Checking SIM statuses");
        final ArrayList arrayList = new ArrayList();
        crny crnyVar = this.h;
        int iC = crnyVar.c();
        int iB = crnyVar.b();
        abak abakVarA = abafVar.a();
        abakVarA.y("defaultSmsSubId", iC);
        abakVarA.r();
        abak abakVarA2 = abafVar.a();
        abakVarA2.y("defaultDataSubId", iB);
        abakVarA2.r();
        Context context = this.g;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            int iE = crnyVar.e();
            for (int i = 0; i < iE; i++) {
                abak abakVarA3 = abafVar.a();
                abakVarA3.y("slotId", i);
                abakVarA3.y("simState", telephonyManager.getSimState(i));
                abakVarA3.r();
            }
        }
        (crnyVar.q() ? Optional.empty() : Optional.of(context.getString(R.string.set_default_sms_sim_suggestion))).ifPresent(new Consumer() { // from class: abax
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                arrayList.add((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cqbm cqbmVar = this.i;
        crmx crmxVar = this.j;
        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager2 == null) {
            abafVar.b("telephony manager is null");
        } else {
            abak abakVarA4 = abafVar.a();
            abakVarA4.B("Device is SMS Capable", telephonyManager2.isSmsCapable());
            abakVarA4.B("Data is enabled", telephonyManager2.isDataEnabled());
            abakVarA4.B("Network is roaming", telephonyManager2.isNetworkRoaming());
            abakVarA4.B("Device is in airplaneMode", crmxVar.E());
            abakVarA4.r();
        }
        List listM = crnyVar.m();
        abaw.a(listM, 0, abafVar, cqbmVar);
        abaw.a(listM, 1, abafVar, cqbmVar);
        (crmxVar.E() ? Optional.of(context.getString(R.string.turn_off_airplane_mode_suggestion)) : Optional.empty()).ifPresent(new Consumer() { // from class: abax
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                arrayList.add((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        bbdl bbdlVar = this.k;
        bbdlVar.i();
        ekqh it = ((ekgb) bbdlVar.h()).iterator();
        while (it.hasNext()) {
            axcy axcyVar = (axcy) it.next();
            abak abakVarA5 = abafVar.a();
            abakVarA5.I("Active subscription:");
            abakVarA5.y("subId", axcyVar.e());
            abakVarA5.y("simSlotId", axcyVar.d());
            abakVarA5.A("selfParticipantId", axcyVar.f());
            if (axcyVar.b().isPresent()) {
                ?? r5 = axcyVar.b().get();
                abakVarA5.A("displayDestination", r5.F());
                abakVarA5.A("normalizedDestination", r5.p(((Boolean) alvx.d.e()).booleanValue()));
            }
            abakVarA5.r();
        }
        axcy axcyVarB = bbdlVar.b();
        if (axcyVarB == null) {
            string = "Default subscription is null.";
        } else {
            abak abakVarA6 = abafVar.a();
            abakVarA6.y("default subId", axcyVarB.e());
            abakVarA6.r();
            string = axcyVarB.b().isEmpty() ? context.getString(R.string.enter_self_phone_number_suggestion) : null;
        }
        Optional.ofNullable(string).ifPresent(new Consumer() { // from class: abax
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                arrayList.add((String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return !arrayList.isEmpty() ? new abaj(4, arrayList) : abaj.a;
    }
}
