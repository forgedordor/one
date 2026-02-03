package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wni implements wms {
    @Override // defpackage.wms
    public final Object a(vvr vvrVar, wmv wmvVar, String str, fcxy fcxyVar) {
        dltd dltdVar = vvrVar.a;
        if (!(dltdVar instanceof RichLocation)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RichLocation richLocation = (RichLocation) dltdVar;
        if (fdbq.f(richLocation.d.a(), "application/vnd.gsma.rcspushlocation+xml")) {
            return new wno(new wnx(richLocation.e, richLocation.a, richLocation.b, richLocation.c), null);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
