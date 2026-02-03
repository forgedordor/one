package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfah extends ArrayList {
    private static final long serialVersionUID = 5193682565287307651L;
    public final dfae a;

    public dfah(dfae dfaeVar) {
        dfaeVar.getClass();
        this.a = dfaeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dfah a(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = r14.getName()
            java.lang.String r1 = ""
            java.lang.String r2 = "state"
            java.lang.String r2 = r14.getAttributeValue(r1, r2)
            if (r2 != 0) goto L11
            dfae r2 = defpackage.dfae.FULL
            goto L15
        L11:
            dfae r2 = defpackage.dfae.a(r2)
        L15:
            dfah r3 = new dfah
            r3.<init>(r2)
            int r2 = r14.nextTag()
            java.lang.String r4 = r14.getNamespace()
            java.lang.String r5 = r14.getName()
        L26:
            r6 = 3
            if (r2 != r6) goto L31
            boolean r2 = r5.equals(r0)
            if (r2 != 0) goto L30
            goto L31
        L30:
            return r3
        L31:
            java.lang.String r2 = "urn:ietf:params:xml:ns:conference-info"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto Ld4
            java.lang.String r4 = "entry"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lcb
            java.lang.String r4 = r14.getName()
            int r5 = r14.nextTag()
            java.lang.String r7 = r14.getNamespace()
            java.lang.String r8 = r14.getName()
            r9 = 0
            r10 = r1
            r11 = r10
            r12 = r11
        L55:
            if (r5 != r6) goto L68
            boolean r5 = r8.equals(r4)
            if (r5 != 0) goto L5e
            goto L68
        L5e:
            dfag r2 = new dfag
            r2.<init>(r10, r11, r12, r9)
            r3.add(r2)
            goto Ld4
        L68:
            boolean r5 = r2.equals(r7)
            if (r5 == 0) goto Lbe
            int r5 = r8.hashCode()
            r7 = 2
            r13 = 1
            switch(r5) {
                case -615513399: goto L96;
                case -220463842: goto L8c;
                case 116076: goto L82;
                case 1569093464: goto L78;
                default: goto L77;
            }
        L77:
            goto La0
        L78:
            java.lang.String r5 = "display-text"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto La0
            r5 = r13
            goto La1
        L82:
            java.lang.String r5 = "uri"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto La0
            r5 = 0
            goto La1
        L8c:
            java.lang.String r5 = "purpose"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto La0
            r5 = r7
            goto La1
        L96:
            java.lang.String r5 = "modified"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto La0
            r5 = r6
            goto La1
        La0:
            r5 = -1
        La1:
            if (r5 == 0) goto Lba
            if (r5 == r13) goto Lb5
            if (r5 == r7) goto Lb0
            if (r5 == r6) goto Laa
            goto Lbe
        Laa:
            dezx r5 = defpackage.dezx.a(r14)
            r9 = r5
            goto Lbe
        Lb0:
            java.lang.String r12 = r14.nextText()
            goto Lbe
        Lb5:
            java.lang.String r11 = r14.nextText()
            goto Lbe
        Lba:
            java.lang.String r10 = r14.nextText()
        Lbe:
            int r5 = r14.nextTag()
            java.lang.String r7 = r14.getNamespace()
            java.lang.String r8 = r14.getName()
            goto L55
        Lcb:
            boolean r2 = defpackage.dezk.a()
            if (r2 == 0) goto Ld4
            defpackage.dhlf.e(r14)
        Ld4:
            int r2 = r14.nextTag()
            java.lang.String r4 = r14.getNamespace()
            java.lang.String r5 = r14.getName()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfah.a(org.xmlpull.v1.XmlPullParser):dfah");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlSerializer xmlSerializer, String str) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        dfae dfaeVar = this.a;
        if (dfaeVar != dfae.NONE && dfaeVar != dfae.FULL) {
            xmlSerializer.attribute("", "state", dfaeVar.e);
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            dfag dfagVar = (dfag) get(i);
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "entry");
            String str2 = dfagVar.a;
            if (!str2.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                xmlSerializer.text(str2);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            }
            String str3 = dfagVar.b;
            if (!str3.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "display-text");
                xmlSerializer.text(str3);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "display-text");
            }
            String str4 = dfagVar.c;
            if (!str4.isEmpty()) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "purpose");
                xmlSerializer.text(str4);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "purpose");
            }
            dezx dezxVar = dfagVar.d;
            if (dezxVar != null) {
                dezxVar.b(xmlSerializer, "modified");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "entry");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dfah)) {
            return false;
        }
        dfah dfahVar = (dfah) obj;
        if (this.a == dfahVar.a) {
            return super.equals(dfahVar);
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + " " + Arrays.toString(toArray());
    }
}
