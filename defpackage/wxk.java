package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wxk implements wwy {
    public final Context a;
    private final ahax b;
    private final cogw c;
    private final aaxw d;

    public wxk(Context context, fdjx fdjxVar, ahax ahaxVar, cogw cogwVar, aaxw aaxwVar) {
        context.getClass();
        fdjxVar.getClass();
        ahaxVar.getClass();
        cogwVar.getClass();
        aaxwVar.getClass();
        this.a = context;
        this.b = ahaxVar;
        this.c = cogwVar;
        this.d = aaxwVar;
    }

    @Override // defpackage.wwy
    public final void a(final fdae fdaeVar, final fdap fdapVar) {
        final ZonedDateTime zonedDateTimeAtZone = this.c.f().truncatedTo(ChronoUnit.MINUTES).atZone(ZoneId.systemDefault());
        int hour = zonedDateTimeAtZone.getHour();
        if (hour < 8) {
            zonedDateTimeAtZone.getClass();
            this.b.d(true, new fdap() { // from class: wwz
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ahat ahatVar = (ahat) obj;
                    ahatVar.getClass();
                    wxk wxkVar = this.a;
                    ZonedDateTime zonedDateTime = zonedDateTimeAtZone;
                    String strE = wxkVar.e();
                    String strD = wxkVar.d();
                    ZonedDateTime zonedDateTimeWithMinute = zonedDateTime.withHour(8).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute.getClass();
                    fdap fdapVar2 = fdapVar;
                    ZonedDateTime zonedDateTimeWithMinute2 = zonedDateTime.withHour(13).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute2.getClass();
                    ZonedDateTime zonedDateTimeWithMinute3 = zonedDateTime.withHour(18).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute3.getClass();
                    return new djmn(strE, fcva.g(wxkVar.b(zonedDateTimeWithMinute, djrr.M, R.string.datetime_picker_preset_option_later_today, ahatVar, fdapVar2), wxkVar.b(zonedDateTimeWithMinute2, djrr.K, R.string.datetime_picker_preset_option_later_today, ahatVar, fdapVar2), wxkVar.b(zonedDateTimeWithMinute3, djrr.cx, R.string.datetime_picker_preset_option_later_today, ahatVar, fdapVar2), new djza(null), wxkVar.c(zonedDateTime, ahatVar, fdaeVar, fdapVar2)), null, strD, null, null, null, wxkVar.f(ahatVar), null, 372);
                }
            });
        } else if (hour < 16) {
            zonedDateTimeAtZone.getClass();
            this.b.d(true, new fdap() { // from class: wxe
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ahat ahatVar = (ahat) obj;
                    ahatVar.getClass();
                    wxk wxkVar = this.a;
                    ZonedDateTime zonedDateTime = zonedDateTimeAtZone;
                    String strE = wxkVar.e();
                    String strD = wxkVar.d();
                    ZonedDateTime zonedDateTimeWithMinute = zonedDateTime.withHour(17).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute.getClass();
                    fdap fdapVar2 = fdapVar;
                    ZonedDateTime zonedDateTimeWithMinute2 = zonedDateTime.withHour(21).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute2.getClass();
                    ZonedDateTime zonedDateTimeWithMinute3 = zonedDateTime.plusDays(1L).withHour(8).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute3.getClass();
                    return new djmn(strE, fcva.g(wxkVar.b(zonedDateTimeWithMinute, djrr.M, R.string.datetime_picker_preset_option_later_today, ahatVar, fdapVar2), wxkVar.b(zonedDateTimeWithMinute2, djrr.K, R.string.scheduled_send_preset_option_later_tonight, ahatVar, fdapVar2), wxkVar.b(zonedDateTimeWithMinute3, djrr.cx, R.string.datetime_picker_preset_option_tomorrow, ahatVar, fdapVar2), new djza(null), wxkVar.c(zonedDateTime, ahatVar, fdaeVar, fdapVar2)), null, strD, null, null, null, wxkVar.f(ahatVar), null, 372);
                }
            });
        } else {
            zonedDateTimeAtZone.getClass();
            this.b.d(true, new fdap() { // from class: wxc
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ahat ahatVar = (ahat) obj;
                    ahatVar.getClass();
                    wxk wxkVar = this.a;
                    ZonedDateTime zonedDateTime = zonedDateTimeAtZone;
                    String strE = wxkVar.e();
                    String strD = wxkVar.d();
                    ZonedDateTime zonedDateTimeWithMinute = zonedDateTime.plusDays(1L).withHour(8).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute.getClass();
                    fdap fdapVar2 = fdapVar;
                    ZonedDateTime zonedDateTimeWithMinute2 = zonedDateTime.plusDays(1L).withHour(13).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute2.getClass();
                    ZonedDateTime zonedDateTimeWithMinute3 = zonedDateTime.plusDays(1L).withHour(18).withSecond(0).withMinute(0);
                    zonedDateTimeWithMinute3.getClass();
                    return new djmn(strE, fcva.g(wxkVar.b(zonedDateTimeWithMinute, djrr.M, R.string.datetime_picker_preset_option_tomorrow, ahatVar, fdapVar2), wxkVar.b(zonedDateTimeWithMinute2, djrr.K, R.string.datetime_picker_preset_option_tomorrow, ahatVar, fdapVar2), wxkVar.b(zonedDateTimeWithMinute3, djrr.cx, R.string.datetime_picker_preset_option_tomorrow, ahatVar, fdapVar2), new djza(null), wxkVar.c(zonedDateTime, ahatVar, fdaeVar, fdapVar2)), null, strD, null, null, null, wxkVar.f(ahatVar), null, 372);
                }
            });
        }
    }

    public final dkeg b(final ZonedDateTime zonedDateTime, djrr djrrVar, int i, final ahat ahatVar, final fdap fdapVar) {
        dkdk dkdkVar = new dkdk(djrrVar);
        String string = this.a.getString(i, this.d.b(zonedDateTime.toInstant().toEpochMilli()));
        string.getClass();
        return new dkeg(string, null, null, null, null, dkdkVar, null, new fdae() { // from class: wxd
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                Instant instant = zonedDateTime.toInstant();
                instant.getClass();
                fdapVar.invoke(instant);
                return fctx.a;
            }
        }, 94);
    }

    public final dkeg c(final ZonedDateTime zonedDateTime, final ahat ahatVar, final fdae fdaeVar, final fdap fdapVar) {
        dkdk dkdkVar = new dkdk(djrr.bb);
        String string = this.a.getString(R.string.datetime_picker_preset_option_custom);
        string.getClass();
        return new dkeg(string, null, null, null, null, dkdkVar, null, new fdae() { // from class: wxf
            @Override // defpackage.fdae
            public final Object invoke() {
                final ZonedDateTime zonedDateTime2 = zonedDateTime;
                Instant instant = zonedDateTime2.toInstant();
                instant.getClass();
                final wxk wxkVar = this;
                Context context = wxkVar.a;
                boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
                fdap fdapVar2 = new fdap() { // from class: wxg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() >= zonedDateTime2.getYear());
                    }
                };
                fdap fdapVar3 = new fdap() { // from class: wxh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        LocalDate localDate = (LocalDate) obj;
                        localDate.getClass();
                        return Boolean.valueOf(localDate.compareTo((ChronoLocalDate) zonedDateTime2.toLocalDate()) >= 0);
                    }
                };
                final ahat ahatVar2 = ahatVar;
                final fdap fdapVar4 = fdapVar;
                fdap fdapVar5 = new fdap() { // from class: wxi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        long jLongValue = ((Long) obj).longValue();
                        ahatVar2.a();
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
                        instantOfEpochMilli.getClass();
                        fdapVar4.invoke(instantOfEpochMilli);
                        return fctx.a;
                    }
                };
                String string2 = context.getString(android.R.string.cancel);
                string2.getClass();
                final fdae fdaeVar2 = fdaeVar;
                dktq dktqVar = new dktq(string2, new fdae() { // from class: wxj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar2.a();
                        wxkVar.a(fdaeVar2, fdapVar4);
                        return fctx.a;
                    }
                });
                fdae fdaeVar3 = new fdae() { // from class: wxa
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar2.a();
                        wxkVar.a(fdaeVar2, fdapVar4);
                        return fctx.a;
                    }
                };
                String string3 = context.getString(R.string.datetime_picker_dialog_finish_button);
                string3.getClass();
                ahatVar2.b(new djml(context, instant, zIs24HourFormat, fdapVar2, fdapVar3, fdapVar5, new dktq(string3, new fdae() { // from class: djmk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                }), dktqVar, fdaeVar3));
                return fctx.a;
            }
        }, 94);
    }

    public final String d() {
        String string = this.a.getString(R.string.scheduled_send_datetime_picker_subtitle);
        string.getClass();
        return string;
    }

    public final String e() {
        String string = this.a.getString(R.string.scheduled_send_datetime_picker_title, TimeZone.getDefault().getDisplayName(ZoneId.systemDefault().getRules().isDaylightSavings(this.c.f()), 0));
        string.getClass();
        return string;
    }

    public final dktq f(final ahat ahatVar) {
        String string = this.a.getString(R.string.datetime_picker_cancel_button);
        string.getClass();
        return new dktq(string, new fdae() { // from class: wxb
            @Override // defpackage.fdae
            public final Object invoke() {
                ahatVar.a();
                wyf.d();
                return fctx.a;
            }
        });
    }
}
