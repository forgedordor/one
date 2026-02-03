package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnj implements wms {
    private final wnh a;
    private final wnd b;
    private final wni c;

    public wnj(wnh wnhVar, wnd wndVar, wni wniVar) {
        this.a = wnhVar;
        this.b = wndVar;
        this.c = wniVar;
    }

    @Override // defpackage.wms
    public final Object a(vvr vvrVar, wmv wmvVar, String str, fcxy fcxyVar) {
        wms wmsVar;
        dltd dltdVar = vvrVar.a;
        if (dltdVar instanceof dohs) {
            wmsVar = this.a;
        } else if (dltdVar instanceof dlto) {
            wmsVar = this.b;
        } else {
            if (!(dltdVar instanceof RichLocation)) {
                Objects.toString(dltdVar);
                throw new UnsupportedOperationException("Unsupported media: ".concat(dltdVar.toString()));
            }
            wmsVar = this.c;
        }
        return wmsVar.a(vvrVar, wmvVar, str, fcxyVar);
    }
}
