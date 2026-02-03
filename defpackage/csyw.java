package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csyw {
    public static final boolean a(MessageCoreData messageCoreData) {
        Optional optionalA = cdsc.a(messageCoreData.as());
        try {
            if (optionalA.isPresent()) {
                if (fdgn.j(new URL((String) optionalA.get()).getHost(), "duo.app.goo.gl", true)) {
                    return true;
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }
}
