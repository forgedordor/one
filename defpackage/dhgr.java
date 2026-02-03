package defpackage;

import android.util.Xml;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhgr {
    public static final dfny a = dfod.a(165911131);
    public final Map b = new HashMap();
    public final crmx c;
    public final dhbz d;
    public String e;
    private final dgfu f;

    public dhgr(dhbz dhbzVar, crmx crmxVar, dgfu dgfuVar) {
        this.d = dhbzVar;
        this.c = crmxVar;
        this.f = dgfuVar;
    }

    public final Optional a(long j) {
        Optional optionalOfNullable;
        Map map = this.b;
        synchronized (map) {
            optionalOfNullable = Optional.ofNullable((dhgp) map.get(Long.valueOf(j)));
        }
        return optionalOfNullable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r3.putAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        defpackage.dhja.i(r0, "Error while closing file: %s", r0.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhgr.b():void");
    }

    public final void c(long j) {
        Long lValueOf = Long.valueOf(j);
        dhja.c("Removing group session information for session: %d", lValueOf);
        Map map = this.b;
        synchronized (map) {
            if (map.remove(lValueOf) == null) {
                return;
            }
            try {
                d();
            } catch (IOException unused) {
                dhja.g("Error while storing group data", new Object[0]);
            }
        }
    }

    public final void d() {
        if (this.e == null) {
            dhja.q("Filename was not generated. Cannot save groups.", new Object[0]);
            return;
        }
        Map map = this.b;
        synchronized (map) {
            OutputStream outputStreamC = null;
            try {
                try {
                    outputStreamC = this.f.c(this.e);
                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                    xmlSerializerNewSerializer.setOutput(outputStreamC, "utf-8");
                    xmlSerializerNewSerializer.startDocument("utf-8", false);
                    xmlSerializerNewSerializer.startTag("urn:groupsinfo.jibemobile.com", "groups");
                    for (dhgp dhgpVar : map.values()) {
                        if (dhgpVar.b.isPresent()) {
                            xmlSerializerNewSerializer.startTag("urn:groupsinfo.jibemobile.com", "group");
                            xmlSerializerNewSerializer.attribute("", "key", String.valueOf(dhgpVar.a));
                            xmlSerializerNewSerializer.attribute("", "contributionId", dhgpVar.d);
                            if (dhgpVar.e.isPresent()) {
                                xmlSerializerNewSerializer.attribute("", "conferenceUri", (String) dhgpVar.e.get());
                            }
                            if (dhgpVar.f.isPresent()) {
                                xmlSerializerNewSerializer.attribute("", "subject", (String) dhgpVar.f.get());
                            }
                            if (dhgpVar.g.isPresent() && ((Long) dhgpVar.g.get()).longValue() > 0) {
                                xmlSerializerNewSerializer.attribute("", "removed", dhgpVar.g.get().toString());
                            }
                            if (dhgpVar.b.isPresent()) {
                                ((dezn) dhgpVar.b.get()).d(xmlSerializerNewSerializer, "conference-info");
                            }
                            xmlSerializerNewSerializer.endTag("urn:groupsinfo.jibemobile.com", "group");
                        }
                    }
                    xmlSerializerNewSerializer.endTag("urn:groupsinfo.jibemobile.com", "groups");
                    xmlSerializerNewSerializer.endDocument();
                    xmlSerializerNewSerializer.flush();
                    if (outputStreamC != null) {
                        try {
                            outputStreamC.close();
                        } catch (IOException e) {
                            dhja.i(e, "Error while closing stream: %s", e.getMessage());
                        }
                    }
                } catch (FileNotFoundException e2) {
                    throw new IOException("File could not be opened", e2);
                }
            } finally {
            }
        }
        dhja.c("Groups saved", new Object[0]);
    }
}
