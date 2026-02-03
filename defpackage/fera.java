package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fera extends femq implements feov {
    public static final fera a = new fera();
    private static final long serialVersionUID = -7174232004486979641L;

    protected fera() {
        b("ACTION", new feow());
        b("ATTACH", new feox());
        b("ATTENDEE", new feoy());
        b("CALSCALE", new feoz());
        b(VCardConstants.PROPERTY_CATEGORIES, new fepa());
        b("CLASS", new fepb());
        b("COMMENT", new fepc());
        b("COMPLETED", new fepd());
        b("CONTACT", new fepe());
        b("COUNTRY", new fepf());
        b("CREATED", new fepg());
        b("DESCRIPTION", new feph());
        b("DTEND", new fepi());
        b("DTSTAMP", new fepj());
        b("DTSTART", new fepk());
        b("DUE", new fepl());
        b("DURATION", new fepm());
        b("EXDATE", new fepn());
        b("EXRULE", new fepo());
        b("EXTENDED-ADDRESS", new fepp());
        b("FREEBUSY", new fepq());
        b(VCardConstants.PROPERTY_GEO, new fepr());
        b("LAST-MODIFIED", new feps());
        b("LOCALITY", new fept());
        b("LOCATION", new fepu());
        b("LOCATION-TYPE", new fepv());
        b("METHOD", new fepw());
        b(VCardConstants.PROPERTY_NAME, new fepx());
        b("ORGANIZER", new fepy());
        b("PERCENT-COMPLETE", new fepz());
        b("POSTAL-CODE", new feqa());
        b("PRIORITY", new feqb());
        b(VCardConstants.PROPERTY_PRODID, new feqc());
        b("RDATE", new feqd());
        b("RECURRENCE-ID", new feqf());
        b("REGION", new feqg());
        b("RELATED-TO", new feqh());
        b("REPEAT", new feqi());
        b("REQUEST-STATUS", new feqj());
        b("RESOURCES", new feqk());
        b("RRULE", new feqe());
        b("SEQUENCE", new feql());
        b("STATUS", new feqm());
        b("STREET-ADDRESS", new feqn());
        b("SUMMARY", new feqo());
        b(VCardConstants.PROPERTY_TEL, new feqp());
        b("TRANSP", new feqq());
        b("TRIGGER", new feqr());
        b("TZID", new feqs());
        b("TZNAME", new feqt());
        b("TZOFFSETFROM", new fequ());
        b("TZOFFSETTO", new feqv());
        b("TZURL", new feqw());
        b(VCardConstants.PROPERTY_UID, new feqx());
        b(VCardConstants.PROPERTY_URL, new feqy());
        b(VCardConstants.PROPERTY_VERSION, new feqz());
    }

    @Override // defpackage.feov
    public final feou a(String str) {
        feov feovVar = (feov) hN(str);
        if (feovVar != null) {
            return feovVar.a(str);
        }
        if (str.startsWith("X-") && str.length() > 2) {
            return new fewq(str);
        }
        if (c()) {
            return new fewq(str);
        }
        throw new IllegalArgumentException(a.a(str, "Illegal property [", "]"));
    }
}
