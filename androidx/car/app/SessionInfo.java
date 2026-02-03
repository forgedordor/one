package androidx.car.app;

import androidx.car.app.navigation.model.NavigationTemplate;
import defpackage.cmb;
import defpackage.cpp;
import defpackage.ekhx;
import defpackage.ekon;
import defpackage.ekph;
import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class SessionInfo {
    private static final ekhx<Class<? extends cpp>> CLUSTER_SUPPORTED_TEMPLATES_API_6 = new ekph(NavigationTemplate.class);
    private static final ekhx<Class<? extends cpp>> CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6 = ekon.a;
    public static final SessionInfo DEFAULT_SESSION_INFO = new SessionInfo(0, "main");
    public static final int DISPLAY_TYPE_CLUSTER = 1;
    public static final int DISPLAY_TYPE_MAIN = 0;
    private static final char DIVIDER = '/';
    private final int mDisplayType;
    private final String mSessionId;

    private SessionInfo() {
        this.mSessionId = "main";
        this.mDisplayType = 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SessionInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return getSessionId().equals(sessionInfo.getSessionId()) && getDisplayType() == sessionInfo.getDisplayType();
    }

    public int getDisplayType() {
        return this.mDisplayType;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public Set<Class<? extends cpp>> getSupportedTemplates(int i) {
        if (this.mDisplayType == 1) {
            return i >= 6 ? CLUSTER_SUPPORTED_TEMPLATES_API_6 : CLUSTER_SUPPORTED_TEMPLATES_LESS_THAN_API_6;
        }
        return null;
    }

    public int hashCode() {
        return Objects.hash(this.mSessionId, Integer.valueOf(this.mDisplayType));
    }

    public String toString() {
        return String.valueOf(this.mDisplayType) + DIVIDER + this.mSessionId;
    }

    public SessionInfo(int i, String str) {
        this.mDisplayType = i;
        this.mSessionId = str;
    }
}
