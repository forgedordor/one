package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cpm;
import defpackage.cpp;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class TabContents {
    public static final String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final cpp mTemplate;

    private TabContents() {
        this.mTemplate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabContents) {
            return Objects.equals(this.mTemplate, ((TabContents) obj).mTemplate);
        }
        return false;
    }

    public String getContentId() {
        return CONTENT_ID;
    }

    public cpp getTemplate() {
        cpp cppVar = this.mTemplate;
        cppVar.getClass();
        return cppVar;
    }

    public int hashCode() {
        return Objects.hash(this.mTemplate);
    }

    public String toString() {
        return "[template: " + this.mTemplate + "]";
    }

    TabContents(cpm cpmVar) {
        cpp cppVar = cpmVar.a;
        this.mTemplate = null;
    }
}
