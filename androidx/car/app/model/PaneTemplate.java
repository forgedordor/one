package androidx.car.app.model;

import defpackage.cmb;
import defpackage.cnt;
import defpackage.cou;
import defpackage.cpp;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public final class PaneTemplate implements cpp {

    @Deprecated
    private final ActionStrip mActionStrip;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final Pane mPane;

    @Deprecated
    private final CarText mTitle;

    private PaneTemplate() {
        this.mTitle = null;
        this.mPane = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mHeader = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return Objects.equals(this.mTitle, paneTemplate.mTitle) && Objects.equals(this.mPane, paneTemplate.mPane) && Objects.equals(this.mHeaderAction, paneTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, paneTemplate.mActionStrip) && Objects.equals(this.mHeader, paneTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        cnt cntVar = new cnt();
        CarText carText = this.mTitle;
        if (carText != null) {
            cntVar.d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            cntVar.c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                cntVar.b(it.next());
            }
        }
        return cntVar.a();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public Pane getPane() {
        Pane pane = this.mPane;
        pane.getClass();
        return pane;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mPane, this.mHeaderAction, this.mActionStrip, this.mHeader);
    }

    public String toString() {
        return "PaneTemplate";
    }

    PaneTemplate(cou couVar) {
        CarText carText = couVar.a;
        this.mTitle = null;
        Pane pane = couVar.b;
        this.mPane = null;
        Action action = couVar.c;
        this.mHeaderAction = null;
        ActionStrip actionStrip = couVar.d;
        this.mActionStrip = null;
        Header header = couVar.e;
        this.mHeader = null;
    }
}
