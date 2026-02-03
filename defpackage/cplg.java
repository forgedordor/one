package defpackage;

import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cplg extends cplf {
    private static final ekrg j = ekrg.c("com/google/android/apps/messaging/shared/util/calendar/CalendarBuilderWrapper");

    public cplg() {
        super(new cplo(), new ferb(), new feoq(), feri.a.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cplh c(InputStream inputStream) throws IOException, femo {
        fewr.a("ical4j.unfolding.relaxed", true);
        fewr.a("ical4j.parsing.relaxed", true);
        fewr.a("ical4j.compatibility.outlook", true);
        fewr.a("ical4j.compatibility.notes", true);
        try {
            femp fempVar = new femp(new InputStreamReader(inputStream, cplf.a));
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.e = new ArrayList();
            femd femdVar = this.b;
            femm femmVar = this.c;
            StreamTokenizer streamTokenizer = new StreamTokenizer(fempVar);
            try {
                streamTokenizer.resetSyntax();
                streamTokenizer.wordChars(32, 255);
                streamTokenizer.whitespaceChars(0, 20);
                streamTokenizer.ordinaryChar(58);
                streamTokenizer.ordinaryChar(59);
                streamTokenizer.ordinaryChar(61);
                streamTokenizer.ordinaryChar(9);
                streamTokenizer.eolIsSignificant(true);
                streamTokenizer.whitespaceChars(0, 0);
                streamTokenizer.quoteChar(34);
                cplo.e(streamTokenizer, fempVar, VCardConstants.PROPERTY_BEGIN, true);
                cplo.f(streamTokenizer, fempVar, 58);
                cplo.e(streamTokenizer, fempVar, "VCALENDAR", true);
                cplo.f(streamTokenizer, fempVar, 10);
                ((cple) femmVar).d.f = new fems();
                ((cplo) femdVar).d.a(streamTokenizer, fempVar, femmVar);
                cplj cpljVar = ((cplo) femdVar).b;
                while (ejuf.e(VCardConstants.PROPERTY_BEGIN, streamTokenizer.sval)) {
                    cpljVar.a.c.a(streamTokenizer, fempVar, femmVar);
                    cplo.c(streamTokenizer, fempVar);
                }
                cplo.f(streamTokenizer, fempVar, 58);
                cplo.e(streamTokenizer, fempVar, "VCALENDAR", true);
            } catch (Exception e) {
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                if (!(e instanceof femo)) {
                    throw new femo(e.getMessage(), cplo.a(streamTokenizer, fempVar), e);
                }
            }
            if (!this.e.isEmpty()) {
                super.b();
            }
            this.f.getClass();
            fems femsVar = this.f;
            femsVar.getClass();
            fenb fenbVar = femsVar.b;
            int size = fenbVar.size();
            for (int i = 0; i < size; i++) {
                E e2 = fenbVar.get(i);
                femz femzVar = e2 instanceof femz ? (femz) e2 : null;
                if (femzVar != null && "VEVENT".equals(femzVar.a)) {
                    feou feouVarA = femzVar.a("SUMMARY");
                    String strA = feouVarA == null ? null : feouVarA.a();
                    feou feouVarA2 = femzVar.a("DESCRIPTION");
                    String strA2 = feouVarA2 == null ? null : feouVarA2.a();
                    feou feouVarA3 = femzVar.a("LOCATION");
                    String strA3 = feouVarA3 == null ? null : feouVarA3.a();
                    fesg fesgVar = (fesg) femzVar;
                    long time = fesgVar.c().c.getTime();
                    feus feusVar = (feus) fesgVar.a("DTEND");
                    if (feusVar == null && fesgVar.c() != null) {
                        feuu feuuVarC = fesgVar.c();
                        feus feusVar2 = new feus(fewu.d((fesgVar.d() != null ? fesgVar.d() : feuuVarC.c instanceof fenh ? new feuw(new fenj(0)) : new feuw(new fenj(1))).c.b(feuuVarC.c), (fety) feuuVarC.b(VCardConstants.PARAM_VALUE)));
                        if (feuuVarC.g()) {
                            feusVar2.f(true);
                        }
                        feusVar = feusVar2;
                    }
                    long time2 = feusVar.c.getTime();
                    feou feouVarA4 = femzVar.a("RRULE");
                    return new cpld(Long.valueOf(time), Long.valueOf(time2), strA, strA2, strA3, feouVarA4 != null ? feouVarA4.a() : null);
                }
            }
            return null;
        } catch (femo e3) {
            ekrw ekrwVarI = j.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e3)).h("com/google/android/apps/messaging/shared/util/calendar/CalendarBuilderWrapper", "buildEvent", '7', "CalendarBuilderWrapper.java")).q("Failed to fetch event from file!");
            return null;
        }
    }
}
