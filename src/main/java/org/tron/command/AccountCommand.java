/*
 * java-tron is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * java-tron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.tron.command;

import org.tron.peer.Peer;
import org.tron.utils.ByteArray;

public class AccountCommand extends Command {
    public AccountCommand() {
    }

    @Override
    public void execute(Peer peer, String[] parameters) {
        System.out.println(ByteArray.toHexString(peer.getMyKey().getAddress()));
    }

    @Override
    public void usage() {
        System.out.println("");
        System.out.println("USAGE [account]:");
        System.out.println("Command: account");
        System.out.println("Description: Get your account.");
        System.out.println("");
    }

    @Override
    public boolean check(String[] parameters) {
        return true;
    }
}
