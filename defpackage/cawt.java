package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cawt extends cayv {
    static final cczi a = cdag.e(cdag.b, "cms_update_telephony_timestamp_max_retries", Alert.DURATION_SHOW_INDEFINITELY);
    public static final cqce b = cqce.g("BugleCms", "UpdateTimestampInTelephonyHandler");
    private final eosc c;
    private final egxv d;
    private final fcsu e;

    public cawt(eosc eoscVar, egxv egxvVar, fcsu fcsuVar) {
        this.c = eoscVar;
        this.d = egxvVar;
        this.e = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) a.e()).intValue());
        caxzVarL.b(caze.WAKELOCK);
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UpdateTimestampInTelephonyHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cawv.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cawv cawvVar = (cawv) evuhVar;
        String str = cawvVar.b;
        long j = cawvVar.d;
        int i = cawvVar.c;
        char c = i != 0 ? i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
        char c2 = c != 0 ? c : (char) 1;
        long j2 = c2 == 4 ? j / 1000 : j;
        if (j == 0 || j2 == 0 || str.isEmpty()) {
            if (j2 == 0) {
                ((ains) this.e.b()).c(c2 == 4 ? "Bugle.Cms.UpdateTimestampInTelephonyHandler.TimestampIsZero.Mms.Counts" : "Bugle.Cms.UpdateTimestampInTelephonyHandler.TimestampIsZero.Sms.Counts");
            }
            return eijx.e(cbcw.i());
        }
        final Uri uri = Uri.parse(str);
        ContentValues contentValues = new ContentValues();
        Long lValueOf = Long.valueOf(j2);
        contentValues.put("date", lValueOf);
        contentValues.put("date_sent", lValueOf);
        eiju eijuVarG = eiju.g(this.d.g(uri, contentValues, null));
        ejvr ejvrVar = new ejvr() { // from class: cawr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = cawt.b;
                int iIntValue = ((Integer) obj).intValue();
                Uri uri2 = uri;
                if (iIntValue > 0) {
                    cqbd cqbdVarC = cawt.b.c();
                    cqbdVarC.I("Telephony message timestamp updated");
                    cqbdVarC.A("Telephony uri", uri2);
                    cqbdVarC.r();
                    return cbcw.i();
                }
                cqbd cqbdVarE = cawt.b.e();
                cqbdVarE.I("Failed to update Telephony message timestamp");
                cqbdVarE.A("Telephony uri", uri2);
                cqbdVarE.r();
                return cbcw.k();
            }
        };
        eosc eoscVar = this.c;
        return eijuVarG.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: caws
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (th instanceof egrm) {
                    cawt.b.o("Failed to update Telephony timestamp: No matching provider", th);
                    return cbcw.k();
                }
                cawt.b.o("Failed to update Telephony timestamp", th);
                return cbcw.m();
            }
        }, eoscVar);
    }
}
