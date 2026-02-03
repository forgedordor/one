package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cpj;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class Tab {
    private static final String EMPTY_TAB_CONTENT_ID = "EMPTY_TAB_CONTENT_ID";
    private final String mContentId;
    private final CarIcon mIcon;
    private final CarText mTitle;

    private Tab() {
        this.mTitle = null;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
        this.mIcon = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return Objects.equals(this.mTitle, tab.mTitle) && Objects.equals(this.mContentId, tab.mContentId) && Objects.equals(this.mIcon, tab.mIcon);
    }

    public String getContentId() {
        String str = this.mContentId;
        str.getClass();
        return str;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        carIcon.getClass();
        return carIcon;
    }

    public CarText getTitle() {
        CarText carText = this.mTitle;
        carText.getClass();
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mContentId, this.mIcon);
    }

    public String toString() {
        return "[title: " + CarText.toShortString(this.mTitle) + ", contentId: " + this.mContentId + ", icon: " + this.mIcon + "]";
    }

    Tab(cpj cpjVar) {
        CarText carText = cpjVar.a;
        this.mTitle = null;
        CarIcon carIcon = cpjVar.b;
        this.mIcon = null;
        String str = cpjVar.c;
        this.mContentId = EMPTY_TAB_CONTENT_ID;
    }
}
