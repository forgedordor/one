package defpackage;

import com.android.vcard.VCardEntry;
import com.android.vcard.VCardInterpreter;
import com.android.vcard.VCardProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxhd implements VCardInterpreter {
    public VCardEntry b;
    private final int d;
    public final List a = new ArrayList();
    public final List c = new ArrayList();

    public bxhd(int i) {
        this.d = i;
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onEntryEnded() {
        VCardEntry vCardEntry = this.b;
        vCardEntry.getClass();
        vCardEntry.consolidateFields();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((bxhc) it.next()).b(vCardEntry);
        }
        List list = this.a;
        int size = list.size();
        if (size > 1) {
            VCardEntry vCardEntry2 = (VCardEntry) list.get(size - 2);
            vCardEntry2.addChild(vCardEntry);
            this.b = vCardEntry2;
        } else {
            this.b = null;
        }
        list.remove(size - 1);
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onEntryStarted() {
        VCardEntry vCardEntry = new VCardEntry(this.d);
        this.b = vCardEntry;
        this.a.add(vCardEntry);
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onPropertyCreated(VCardProperty vCardProperty) throws eaga, NumberFormatException {
        VCardEntry vCardEntry = this.b;
        vCardEntry.getClass();
        vCardEntry.addProperty(vCardProperty);
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onVCardEnded() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((bxhc) it.next()).a();
        }
    }

    @Override // com.android.vcard.VCardInterpreter
    public final void onVCardStarted() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((bxhc) it.next()).c();
        }
    }
}
