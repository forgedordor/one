package defpackage;

import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ryd extends rxm {
    protected ryd() {
    }

    @Override // defpackage.rxm, defpackage.rxo
    public final void b(rxs rxsVar) throws SAXException {
        if (!(rxsVar instanceof ryc)) {
            throw new SAXException(a.b(rxsVar, "Text content elements cannot contain ", " elements."));
        }
        this.i.add(rxsVar);
    }
}
