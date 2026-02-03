package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjbl {
    private final asqx a;

    public cjbl(asqx asqxVar) {
        this.a = asqxVar;
    }

    public static final RcsDestinationId b(aubq aubqVar) {
        aubp aubpVar = aubp.PHONE;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        if (aubpVar.equals(aubpVarB)) {
            efid efidVar = new efid();
            efidVar.c(1);
            efidVar.b(aubqVar.d);
            return efidVar.a();
        }
        String str = aubqVar.d.startsWith("sip:") ? aubqVar.d : String.format("%s%s", "sip:", aubqVar.d);
        efid efidVar2 = new efid();
        efidVar2.c(2);
        efidVar2.b(str);
        return efidVar2.a();
    }

    public final aubq a(RcsDestinationId rcsDestinationId, boolean z) {
        if (z || rcsDestinationId.b() == 1) {
            return this.a.a(rcsDestinationId.a(), z);
        }
        String strSubstring = rcsDestinationId.a().startsWith("sip:") ? rcsDestinationId.a().substring(4) : rcsDestinationId.a();
        int iIndexOf = strSubstring.indexOf(59);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return this.a.a(strSubstring, false);
    }
}
