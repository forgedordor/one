package androidx.car.app.media.model;

import androidx.car.app.model.Header;
import defpackage.cmb;
import defpackage.cmy;
import defpackage.cpp;
import j$.util.Objects;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class MediaPlaybackTemplate implements cpp {
    private final Header mHeader;

    private MediaPlaybackTemplate() {
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaPlaybackTemplate) {
            return Objects.equals(this.mHeader, ((MediaPlaybackTemplate) obj).mHeader);
        }
        return false;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    MediaPlaybackTemplate(cmy cmyVar) {
        Header header = cmyVar.a;
        this.mHeader = null;
    }
}
