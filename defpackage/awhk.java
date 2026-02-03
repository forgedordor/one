package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhk implements awhe {
    private final Map a;

    public awhk(cmuh cmuhVar, cmuq cmuqVar) {
        HashMap map = new HashMap();
        this.a = map;
        map.put("MMS_ENABLED", String.valueOf(cmuhVar.p()));
        map.put("GROUP_MMS_ENABLED", String.valueOf(cmuqVar.d(cmuhVar.a)));
        map.put("MAX_MESSAGE_SIZE", String.valueOf(cmuhVar.b()));
        map.put("MAX_TEXT_LENGTH", String.valueOf(cmuhVar.d()));
        map.put("MAX_SUBJECT_LENGTH", String.valueOf(cmuhVar.c()));
        map.put("SUPPORTS_MMS_PRIORITY", String.valueOf(cmuhVar.w()));
        map.put("SUPPORTS_FILE_TRANSFER", "true");
        map.put("EMAIL_GATEWAY", cmuhVar.h());
        map.put("EMAIL_SMS_TO_MMS_THRESHOLD", String.valueOf(cmuhVar.a()));
    }

    @Override // defpackage.awhe
    public final String a(String str) {
        return (String) this.a.get(str);
    }
}
