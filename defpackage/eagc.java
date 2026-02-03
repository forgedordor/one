package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagc implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean e;
    private boolean g;
    public String a = "";
    public String b = "";
    public final List c = new ArrayList();
    public String d = "";
    private boolean f = false;
    private String h = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.e = true;
            this.d = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.g = true;
            this.h = utf2;
        }
        this.f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        List list = this.c;
        int size = list.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) list.get(i));
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.d);
        }
        objectOutput.writeBoolean(this.g);
        if (this.g) {
            objectOutput.writeUTF(this.h);
        }
        objectOutput.writeBoolean(this.f);
    }
}
