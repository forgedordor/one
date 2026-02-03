package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezn {
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public dfak d;
    public dfah e;
    public dfac f;
    public final String g;
    public final dfae h;
    public int i;

    public dezn(dfae dfaeVar, String str, int i) {
        dfae dfaeVar2 = dfae.NONE;
        this.d = new dfak(dfaeVar2);
        this.e = new dfah(dfaeVar2);
        this.f = new dfac(dfaeVar2);
        this.h = dfaeVar;
        this.g = str;
        this.i = i;
    }

    public static dezn a(XmlPullParser xmlPullParser) {
        return b(xmlPullParser, "conference-info");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r8 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0172, code lost:
    
        r0 = "participant";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017c, code lost:
    
        throw new java.lang.IllegalStateException("subject-ext is missing ".concat(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dezn b(org.xmlpull.v1.XmlPullParser r33, java.lang.String r34) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dezn.b(org.xmlpull.v1.XmlPullParser, java.lang.String):dezn");
    }

    public final void c() {
        dfak dfakVar = this.d;
        if (dfakVar.isEmpty()) {
            return;
        }
        Iterator it = dfakVar.iterator();
        while (it.hasNext()) {
            dfaj dfajVar = (dfaj) it.next();
            if (!dfajVar.g() || !dfajVar.h()) {
                it.remove();
            }
            dezw dezwVar = dezw.PENDING;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(XmlSerializer xmlSerializer, String str) throws IllegalStateException, IOException, IllegalArgumentException {
        String str2;
        String str3;
        String str4;
        int i;
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        String str5 = this.g;
        if (str5 != null) {
            xmlSerializer.attribute("", "entity", str5);
        }
        dfae dfaeVar = this.h;
        dfae dfaeVar2 = dfae.NONE;
        if (dfaeVar != dfaeVar2) {
            xmlSerializer.attribute("", "state", dfaeVar.e);
        }
        xmlSerializer.attribute("", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, Integer.toString(this.i));
        if (this.a.isPresent()) {
            Object obj = this.a.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "conference-description");
            dezi deziVar = (dezi) obj;
            if (!deziVar.a.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(deziVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            if (deziVar.b.isPresent() && !((String) deziVar.b.get()).isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "subject");
                xmlSerializer.text((String) deziVar.b.get());
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "subject");
            }
            if (deziVar.c.isPresent()) {
                Object obj2 = deziVar.c.get();
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "subject-ext");
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "participant");
                str2 = "entity";
                dfaf dfafVar = (dfaf) obj2;
                str3 = "state";
                xmlSerializer.text(dfafVar.a);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "participant");
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "timestamp");
                Optional optional = dfafVar.b;
                if (optional.isPresent()) {
                    xmlSerializer.text(((dhie) optional.get()).toString());
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "timestamp");
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "subject-ext");
            } else {
                str2 = "entity";
                str3 = "state";
            }
            if (!deziVar.d.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "free-text");
                xmlSerializer.text(deziVar.d);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "free-text");
            }
            if (!deziVar.e.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "keywords");
                xmlSerializer.text(deziVar.e);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "keywords");
            }
            if (!deziVar.f.isEmpty()) {
                dfah dfahVar = deziVar.f;
                if (dfahVar.a != dfaeVar2) {
                    dfahVar.b(xmlSerializer, "conf-uris");
                }
            }
            if (!deziVar.g.isEmpty()) {
                dfah dfahVar2 = deziVar.g;
                if (dfahVar2.a != dfaeVar2) {
                    dfahVar2.b(xmlSerializer, "service-uris");
                }
            }
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "maximum-user-count");
            xmlSerializer.text(Integer.toString(deziVar.h));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "maximum-user-count");
            if (!deziVar.i.isEmpty()) {
                dezp dezpVar = deziVar.i;
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "available-media");
                int size = dezpVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    dezo dezoVar = (dezo) dezpVar.get(i2);
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
                    String str6 = dezoVar.d;
                    if (!str6.isEmpty()) {
                        xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, str6);
                    }
                    if (!dezoVar.a.isEmpty()) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                        xmlSerializer.text(dezoVar.a);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                    }
                    if (!dezoVar.b.isEmpty()) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                        xmlSerializer.text(dezoVar.b);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                    }
                    dfab dfabVar = dezoVar.c;
                    if (dfabVar != dfab.NONE) {
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                        xmlSerializer.text(dfabVar.f);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                    }
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "available-media");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "conference-description");
        } else {
            str2 = "entity";
            str3 = "state";
        }
        if (this.b.isPresent()) {
            Object obj3 = this.b.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "host-info");
            dezy dezyVar = (dezy) obj3;
            String str7 = dezyVar.a;
            if (!str7.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(str7);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            String str8 = dezyVar.b;
            if (!str8.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "web-page");
                xmlSerializer.text(str8);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "web-page");
            }
            dezyVar.c.b(xmlSerializer, "uris");
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "host-info");
        }
        if (this.c.isPresent()) {
            Object obj4 = this.c.get();
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "conference-state");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "user-count");
            dezq dezqVar = (dezq) obj4;
            xmlSerializer.text(Integer.toString(dezqVar.a));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "user-count");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "active");
            xmlSerializer.text(dezq.a(dezqVar.b));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "active");
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "locked");
            xmlSerializer.text(dezq.a(dezqVar.c));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "locked");
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "conference-state");
        }
        if (this.d.isEmpty()) {
            str4 = str3;
        } else {
            dfak dfakVar = this.d;
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "users");
            dfae dfaeVar3 = dfakVar.a;
            if (dfaeVar3 == dfaeVar2 || dfaeVar3 == dfae.FULL) {
                str4 = str3;
            } else {
                str4 = str3;
                xmlSerializer.attribute("", str4, dfaeVar3.e);
            }
            int size2 = dfakVar.size();
            int i3 = 0;
            while (i3 < size2) {
                dfaj dfajVar = (dfaj) dfakVar.get(i3);
                dfak dfakVar2 = dfakVar;
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "user");
                String str9 = dfajVar.g;
                int i4 = size2;
                String str10 = str2;
                if (str9 != null) {
                    xmlSerializer.attribute("", str10, str9);
                }
                dfae dfaeVar4 = dfajVar.h;
                if (dfaeVar4 != dfaeVar2) {
                    xmlSerializer.attribute("", str4, dfaeVar4.e);
                }
                if (dfajVar.i) {
                    i = i3;
                    xmlSerializer.attribute("", "yourown", "true");
                } else {
                    i = i3;
                }
                if (dfajVar.j) {
                    xmlSerializer.attribute("", "joined", "true");
                }
                if (dfajVar.a != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                    xmlSerializer.text(dfajVar.a);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                }
                dfah dfahVar3 = dfajVar.b;
                if (!dfahVar3.isEmpty()) {
                    dfahVar3.b(xmlSerializer, "associated-aors");
                }
                if (!dfajVar.c.isEmpty()) {
                    dfal dfalVar = dfajVar.c;
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "roles");
                    int size3 = dfalVar.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        int i6 = i5;
                        String str11 = (String) dfalVar.get(i5);
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
                        xmlSerializer.text(str11);
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
                        i5 = i6 + 1;
                    }
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "roles");
                }
                if (dfajVar.d != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "languages");
                    xmlSerializer.text(dfajVar.d);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "languages");
                }
                if (dfajVar.e != null) {
                    xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "cascaded-focus");
                    xmlSerializer.text(dfajVar.e);
                    xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "cascaded-focus");
                }
                List list = dfajVar.f;
                if (!list.isEmpty()) {
                    int i7 = 0;
                    while (i7 < list.size()) {
                        dezv dezvVar = (dezv) list.get(i7);
                        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "endpoint");
                        String str12 = dezvVar.j;
                        if (str12 != null) {
                            xmlSerializer.attribute("", str10, str12);
                        }
                        dfae dfaeVar5 = dezvVar.k;
                        List list2 = list;
                        if (dfaeVar5 != dfaeVar2 && dfaeVar5 != dfae.FULL) {
                            xmlSerializer.attribute("", str4, dfaeVar5.e);
                        }
                        String str13 = dezvVar.a;
                        if (str13 != null) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            xmlSerializer.text(str13);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                        }
                        if (dezvVar.b.isPresent()) {
                            ((dezx) dezvVar.b.get()).b(xmlSerializer, "referred");
                        }
                        if (dezvVar.c != dezw.NONE) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                            xmlSerializer.text(dezvVar.c.k);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                        }
                        if (dezvVar.d != dezz.UNKNOWN) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "joining-method");
                            xmlSerializer.text(dezvVar.d.e);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "joining-method");
                        }
                        if (dezvVar.e.isPresent()) {
                            ((dezx) dezvVar.e.get()).b(xmlSerializer, "joining-info");
                        }
                        if (dezvVar.f != dezu.UNKNOWN) {
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "disconnection-method");
                            xmlSerializer.text(dezvVar.f.f);
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "disconnection-method");
                        }
                        if (dezvVar.g.isPresent()) {
                            ((dezx) dezvVar.g.get()).b(xmlSerializer, "disconnection-info");
                        }
                        Iterator it = dezvVar.h.iterator();
                        while (it.hasNext()) {
                            dfaa dfaaVar = (dfaa) it.next();
                            Iterator it2 = it;
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "media");
                            int i8 = i7;
                            xmlSerializer.attribute("", "id", dfaaVar.a);
                            if (dfaaVar.b != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                                xmlSerializer.text(dfaaVar.b);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            }
                            if (dfaaVar.c != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                                xmlSerializer.text(dfaaVar.c);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                            }
                            if (dfaaVar.d != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                                xmlSerializer.text(dfaaVar.d);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                            }
                            if (dfaaVar.e != null) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "src-id");
                                xmlSerializer.text(dfaaVar.e);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "src-id");
                            }
                            if (dfaaVar.f != dfab.NONE) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "status");
                                xmlSerializer.text(dfaaVar.f.f);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "status");
                            }
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "media");
                            it = it2;
                            i7 = i8;
                        }
                        int i9 = i7;
                        if (dezvVar.i.isPresent()) {
                            Object obj5 = dezvVar.i.get();
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "call-info");
                            dfad dfadVar = ((dezh) obj5).a;
                            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "sip");
                            String str14 = dfadVar.a;
                            if (!str14.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                                xmlSerializer.text(str14);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                            }
                            String str15 = dfadVar.b;
                            if (!str15.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "call-id");
                                xmlSerializer.text(str15);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "call-id");
                            }
                            String str16 = dfadVar.c;
                            if (!str16.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "from-tag");
                                xmlSerializer.text(str16);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "from-tag");
                            }
                            String str17 = dfadVar.d;
                            if (!str17.isEmpty()) {
                                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "to-tag");
                                xmlSerializer.text(str17);
                                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "to-tag");
                            }
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "sip");
                            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "call-info");
                        }
                        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "endpoint");
                        i7 = i9 + 1;
                        list = list2;
                    }
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "user");
                i3 = i + 1;
                str2 = str10;
                dfakVar = dfakVar2;
                size2 = i4;
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "users");
        }
        if (!this.e.isEmpty()) {
            this.e.b(xmlSerializer, "sidebars-by-ref");
        }
        if (!this.f.isEmpty()) {
            dfac dfacVar = this.f;
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "sidebars-by-val");
            dfae dfaeVar6 = dfacVar.a;
            if (dfaeVar6 != dfaeVar2 && dfaeVar6 != dfae.FULL) {
                xmlSerializer.attribute("", str4, dfaeVar6.toString());
            }
            if (!dfacVar.isEmpty()) {
                int size4 = dfacVar.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    ((dezn) dfacVar.get(i10)).d(xmlSerializer, "entry");
                }
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "sidebars-by-val");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void e() {
        dfak dfakVar = this.d;
        int size = dfakVar.size();
        for (int i = 0; i < size; i++) {
            ((dfaj) dfakVar.get(i)).f();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dezn)) {
            return false;
        }
        dezn deznVar = (dezn) obj;
        return TextUtils.equals(this.g, deznVar.g) && this.i == deznVar.i && this.h == deznVar.h && this.a.equals(deznVar.a) && this.c.equals(deznVar.c) && this.b.equals(deznVar.b) && this.e.equals(deznVar.e) && this.f.equals(deznVar.f) && this.d.equals(deznVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(dezn deznVar, crmx crmxVar) {
        if (this.d.isEmpty() && this.d.a == dfae.NONE) {
            this.d = deznVar.d;
            e();
            return;
        }
        dfak dfakVar = this.d;
        dfak dfakVar2 = deznVar.d;
        if (dfakVar2.b()) {
            dfae dfaeVar = dfakVar2.a;
            if (dfaeVar != dfae.FULL) {
                if (dfaeVar == dfae.PARTIAL || dfaeVar == dfae.DELETED) {
                    int size = dfakVar2.size();
                    for (int i = 0; i < size; i++) {
                        dfaj dfajVar = (dfaj) dfakVar2.get(i);
                        if (dfajVar.h()) {
                            Optional optionalA = dfakVar.a(dfajVar.g, crmxVar);
                            if (optionalA.isEmpty()) {
                                dfakVar.add(dfajVar);
                                dfajVar.f();
                            } else {
                                ((dfaj) optionalA.get()).d(dfajVar, crmxVar);
                            }
                        } else {
                            dhja.g("Skipping invalid user during partial update: %s", dfajVar);
                        }
                    }
                    return;
                }
                return;
            }
            int size2 = dfakVar.size();
            for (int i2 = 0; i2 < size2; i2++) {
                dfaj dfajVar2 = (dfaj) dfakVar.get(i2);
                Optional optionalA2 = dfakVar2.a(dfajVar2.g, crmxVar);
                if (optionalA2.isPresent()) {
                    dfajVar2.d((dfaj) optionalA2.get(), crmxVar);
                } else {
                    dfajVar2.c();
                }
            }
            int size3 = dfakVar2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                dfaj dfajVar3 = (dfaj) dfakVar2.get(i3);
                if (dfajVar3.h() && dfajVar3.g() && !dfakVar.a(dfajVar3.g, crmxVar).isPresent()) {
                    dfakVar.add(dfajVar3);
                    dfajVar3.f();
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Integer.valueOf(this.i), this.h, this.a, this.c, this.b, this.e, this.d});
    }

    public final String toString() {
        return "Entity: " + dhiz.USER_ID.c(this.g) + ", version: " + this.i + ", state: " + String.valueOf(this.h) + ", host info: " + String.valueOf(this.b) + ", users: " + String.valueOf(this.d) + ", conference state: " + String.valueOf(this.c) + ", conference description: " + String.valueOf(this.a);
    }
}
